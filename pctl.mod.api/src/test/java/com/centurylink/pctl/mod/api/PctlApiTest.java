package com.centurylink.pctl.mod.api;
import static io.netty.util.NetUtil.LOCALHOST;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.preprocessRequest;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.preprocessResponse;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.prettyPrint;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import com.centurylink.pctl.mod.api.domain.product.*;
import com.centurylink.pctl.mod.api.domain.security.UserDetailsService;
import com.centurylink.pctl.mod.api.domain.security.utils.JwtTokenUtil;
import com.mongodb.Mongo;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.restdocs.JUnitRestDocumentation;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class PctlApiTest {

    @Rule
    public JUnitRestDocumentation  restDocumentation = new JUnitRestDocumentation("target/generated-snippets");

    @Autowired
    private PctlApiProductService pctlApiProductService;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private PriceRepository priceRepository;


    @Autowired
    private WebApplicationContext context;

    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserDetailsService userDetailsService;


    @Value("${jwt.defaultTestUser}")
    private String defaultUser;


    @Value("${jwt.header}")
    private String tokenHeader;


    private static final String LOCALHOST = "127.0.0.1";
    private static final String DB_NAME = "test";
    private static final int MONGO_TEST_PORT = 27017;

/*
    private static MongodProcess mongoProcess;
    private static Mongo mongo;

    @BeforeClass
    public static void initializeDB() throws IOException {

        final MongoCmdOptionsBuilder cmdBuilder = new MongoCmdOptionsBuilder();
        cmdBuilder.useStorageEngine("mmapv1");
        IMongoCmdOptions cmdOptions = cmdBuilder.build();

        MongodStarter starter = MongodStarter.getDefaultInstance();
        IMongodConfig mongodConfig = new MongodConfigBuilder()
            .version(Version.Main.PRODUCTION)
            .net(new Net(MONGO_TEST_PORT, Network.localhostIsIPv6()))
            .cmdOptions(cmdOptions)
            .build();
        MongodExecutable mongoExecutable = starter.prepare(mongodConfig);
        mongoProcess = mongoExecutable.start();

    }

    @AfterClass
    public static void shutdownDB() throws InterruptedException {
//        mongo.close();
        mongoProcess.stop();
    }
*/



    @Before
    public void setup() {
        this.mockMvc =   MockMvcBuilders
            .webAppContextSetup(context)
            .apply(documentationConfiguration(this.restDocumentation))
            .alwaysDo(print())
            .build();
    }

    @Test
    @WithMockUser(username="jbeginsamuel@gmail.com",roles={"USER"})
    public void postsWithUser() throws Exception {

        this.mockMvc.perform(
            get("/products/"))
            .andExpect(status().isOk())
            .andDo(document("list-products",
                preprocessRequest(
                    prettyPrint()),
                preprocessResponse(prettyPrint()),
                responseFields(
                    fieldWithPath("[]._id").description("The Product Unique ' ID"),
                    fieldWithPath("[].productId").description("The Product Id"),
                    fieldWithPath("[].name").description("The Product name"),
                    fieldWithPath("[].updatedAt").description("The Product name"),
                    fieldWithPath("[].discriptionHtml").description("The Product name"),
                    fieldWithPath("[].createdAt").description("The Product name"),
                    fieldWithPath("[].terms").description("The Product name"),
                    fieldWithPath("[].productVariants").description("The Product name"),
                    fieldWithPath("[].productType").description("The Product name")

                )));
    }

    @Test
    @WithMockUser(username="jbeginsamuel@gmail.com",roles={"USER"})
    public void getAllProductsPriceTest() throws Exception {
        List<Price> priceList = priceRepository.findAll();
        assertThat(priceList.size()).isGreaterThan(0);
    }


    @Test
    @WithMockUser(username="jbeginsamuel@gmail.com",roles={"USER"})
    public void getAllProductsTest() throws Exception {
        List<Product> productList = productRepository.findAll();
        assertThat(productList.size()).isGreaterThan(0);
    }


}
