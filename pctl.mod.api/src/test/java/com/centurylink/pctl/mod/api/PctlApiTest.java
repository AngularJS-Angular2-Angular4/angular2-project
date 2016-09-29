package com.centurylink.pctl.mod.api;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.preprocessRequest;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.preprocessResponse;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.prettyPrint;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.requestFields;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.restdocs.JUnitRestDocumentation;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.centurylink.pctl.mod.api.domain.blog.BlogPost;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class PctlApiTest {

	@Rule
	public JUnitRestDocumentation  restDocumentation = new JUnitRestDocumentation("target/generated-snippets");

	@Autowired
	private WebApplicationContext context;

	private MockMvc mockMvc;

	@Autowired
    private ObjectMapper objectMapper;

	@Before
	public void setup() {
		this.mockMvc =   MockMvcBuilders
	            .webAppContextSetup(context)
	            .apply(documentationConfiguration(this.restDocumentation))
	            .alwaysDo(print())
	            .build();
	}

	@Test
	@WithMockUser(username="admin",roles={"USER"})
	public void postsWithUser() throws Exception {

		this.mockMvc.perform(get("/orders/"))
			.andExpect(status().isOk())
			.andDo(document("list-orders",
					preprocessRequest(
							prettyPrint()),
							preprocessResponse(prettyPrint()),
					responseFields(
                    fieldWithPath("[].id").description("The orders' ID"),
                    fieldWithPath("[].title").description("The orders' title"),
                    fieldWithPath("[].content").description("The orders' content"),
                    fieldWithPath("[].uuid").description("The orders' content"),
                    fieldWithPath("[].createdDate").description("The orders' creation date"),
                    fieldWithPath("[].createdBy").description("The orders' created by"),
                    fieldWithPath("[].updatedDate").description("The orders' update data"),
                    fieldWithPath("[].updatedBy").description("The orders' updated by"),
                    fieldWithPath("[].version").description("The orders' version")

            )));
	}

	@Test
	@WithMockUser(username="admin",roles={"USER"})
    public void createPost() throws Exception {

		BlogPost newPost = new BlogPost("Sample Order with product  title for testing", "Sample Order content");

		this.mockMvc.perform(
                post("/orders/").contentType(MediaType.APPLICATION_JSON).content(
                        this.objectMapper.writeValueAsString(newPost)
                )
        ).andExpect(status().isOk())
		.andDo(document("add-order",
					preprocessRequest(
							prettyPrint()),
							preprocessResponse(prettyPrint()),
					requestFields(
							fieldWithPath("title").description("The orders' title"),
							fieldWithPath("content").description("The orders' content"),
							fieldWithPath("id").description("The orders' ID"),
		                    fieldWithPath("uuid").description("The orders' content"),
		                    fieldWithPath("createdDate").description("The orders' creation date"),
		                    fieldWithPath("createdBy").description("The orders' created by"),
		                    fieldWithPath("updatedDate").description("The orders' update data"),
		                    fieldWithPath("updatedBy").description("The orders' updated by"),
		                    fieldWithPath("version").description("The orders' version")

						)
					));
    }

	@Test
	@WithMockUser(username="admin",roles={"USER"})
    public void deletePost() throws Exception {
		this.mockMvc.perform(
                delete("/orders/1")
        ).andExpect(status().isOk())
		.andDo(document("delete-order"));
	}

}
