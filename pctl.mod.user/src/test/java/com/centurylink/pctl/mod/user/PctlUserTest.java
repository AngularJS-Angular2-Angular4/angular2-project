package com.centurylink.pctl.mod.user;

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
import com.centurylink.pctl.mod.core.model.user.User;
import com.centurylink.pctl.mod.user.domain.user.UserRepository;
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
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class PctlUserTest {

    @Rule
    public JUnitRestDocumentation  restDocumentation = new JUnitRestDocumentation("target/generated-snippets");


    @Autowired
    private UserRepository userRepository;


    @Autowired
    private WebApplicationContext context;

    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;



    @Value("${jwt.defaultTestUser}")
    private String defaultUser;


    @Value("${jwt.header}")
    private String tokenHeader;





    @Before
    public void setup() {
        this.mockMvc =   MockMvcBuilders
            .webAppContextSetup(context)
            .apply(documentationConfiguration(this.restDocumentation))
            .alwaysDo(print())
            .build();
    }


    @Test
    public void getAllUsersTest() throws Exception {
        List<User>  user = userRepository.findAll();
        assertThat(user.size()).isGreaterThan(0);


    }




}

