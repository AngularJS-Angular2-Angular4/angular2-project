package com.centurylink.pctl.mod.auth;
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


import com.centurylink.pctl.mod.auth.domain.security.UserDetailsService;
import com.centurylink.pctl.mod.auth.domain.security.utils.JwtTokenUtil;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.restdocs.JUnitRestDocumentation;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class PctlAuthTest {

    @Rule
    public JUnitRestDocumentation  restDocumentation = new JUnitRestDocumentation("target/generated-snippets");


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

        String token = jwtTokenUtil.generateToken("admin");
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



}
