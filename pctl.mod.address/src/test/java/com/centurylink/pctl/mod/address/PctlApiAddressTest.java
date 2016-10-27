
package com.centurylink.pctl.mod.address;

import com.centurylink.pctl.mod.address.domain.address.Address;
import com.centurylink.pctl.mod.address.domain.address.AddressService;
import com.centurylink.pctl.mod.address.domain.address.LocationRequest;
import com.centurylink.pctl.mod.address.domain.address.LocationResponse;
import com.centurylink.pctl.mod.core.utils.Response;
import com.centurylink.pctl.mod.core.utils.StatusCode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.restdocs.JUnitRestDocumentation;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.preprocessRequest;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.prettyPrint;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class PctlApiAddressTest {

    @Autowired
    private AddressService addressService;

    private static final Logger log = LoggerFactory.getLogger(PctlApiAddressTest.class);

    @Test
    public void validateNull() {
        Response<LocationResponse> respo = addressService.validate(null);
        Assert.assertNotNull(respo);
        Assert.assertNotNull(respo.getContent());
        Assert.assertNotNull(respo.getCode());
        Assert.assertNotNull(respo.getMessage());
        Assert.assertNotNull(respo.getHttpStatus());
        Assert.assertEquals(StatusCode.C403.getCode(), respo.getCode());
    }

    @Test
    public void validateEmptyObject() {
        Response<LocationResponse> respo = addressService.validate(new LocationRequest());
        Assert.assertNotNull(respo);
        Assert.assertNotNull(respo.getContent());
        Assert.assertNotNull(respo.getCode());
        Assert.assertNotNull(respo.getMessage());
        Assert.assertNotNull(respo.getHttpStatus());
        Assert.assertEquals(StatusCode.C403.getCode(), respo.getCode());
    }


    @Test
    public void validateEmptyServiceAdd() {
        LocationRequest locationRequest = new LocationRequest();
        Address address = new Address();
        locationRequest.setServiceAddress(address);
        Response<LocationResponse> respo = addressService.validate(locationRequest);
        Assert.assertNotNull(respo);
        Assert.assertNotNull(respo.getContent());
        Assert.assertNotNull(respo.getCode());
        Assert.assertNotNull(respo.getMessage());
        Assert.assertNotNull(respo.getHttpStatus());
        Assert.assertEquals(StatusCode.C401.getCode(), respo.getCode());
    }

    @Test
    public void validateEmptyShippingAdd() {
        LocationRequest locationRequest = new LocationRequest();
        Address address = new Address();
        locationRequest.setShippingAddress(address);
        Response<LocationResponse> respo = addressService.validate(locationRequest);
        Assert.assertNotNull(respo);
        Assert.assertNotNull(respo.getContent());
        Assert.assertNotNull(respo.getCode());
        Assert.assertNotNull(respo.getMessage());
        Assert.assertNotNull(respo.getHttpStatus());
        Assert.assertEquals(StatusCode.C402.getCode(), respo.getCode());
    }

    @Test
    public void validateCorrectAdd() {
        LocationRequest locationRequest = new LocationRequest();
        Address address = new Address();
        locationRequest.setShippingAddress(address);
        locationRequest.setServiceAddress(address);
        Response<LocationResponse> respo = addressService.validate(locationRequest);
        Assert.assertNotNull(respo);
        Assert.assertNotNull(respo.getContent());
        Assert.assertNotNull(respo.getCode());
        Assert.assertNotNull(respo.getMessage());
        Assert.assertNotNull(respo.getHttpStatus());
        Assert.assertEquals(StatusCode.E200.getCode(), respo.getCode());
    }

    @Rule
    public JUnitRestDocumentation restDocumentation = new JUnitRestDocumentation("target/generated-snippets");


    @Autowired
    private WebApplicationContext context;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders
            .webAppContextSetup(context)
            .apply(documentationConfiguration(this.restDocumentation))
            .build();
    }


    @Test
    @WithMockUser(username = "jbeginsamuel@gmail.com", roles = {"USER"})
    public void postsAddress() throws Exception {

        String content = new String(Files.readAllBytes(Paths.get(this.getClass().getResource("/correctAddressRequest.json").toURI())));

        MvcResult result = this.mockMvc.perform(
            post("/address/validation").content(content).contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andDo(document("addressValidation",
                preprocessRequest(
                    prettyPrint()),
                responseFields(
                    fieldWithPath("content.serviceAddress.content.locationName").description("Service Address , Field : locationName"),
                    fieldWithPath("content.serviceAddress.content.address").description("Service Address , Field : Address"),
                    fieldWithPath("content.serviceAddress.content.street").description("Service Address , Field : street"),
                    fieldWithPath("content.serviceAddress.content.country").description("Service Address , Field : Country"),
                    fieldWithPath("content.serviceAddress.content.city").description("Service Address , Field : City"),
                    fieldWithPath("content.serviceAddress.content.state").description("Service Address , Field : State"),
                    fieldWithPath("content.serviceAddress.content.zipCode").description("Service Address , Field : zipCode"),
                    fieldWithPath("content.serviceAddress.message").description("Service Address , Status Message "),
                    fieldWithPath("content.serviceAddress.code").description("Service Address , Status Code"),

                    fieldWithPath("content.shippingAddress.content.locationName").description("Shipping Address , Field : locationName"),
                    fieldWithPath("content.shippingAddress.content.address").description("Shipping Address , Field : Address"),
                    fieldWithPath("content.shippingAddress.content.street").description("Shipping Address , Field : street"),
                    fieldWithPath("content.shippingAddress.content.country").description("Shipping Address , Field : Country"),
                    fieldWithPath("content.shippingAddress.content.city").description("Shipping Address , Field : City"),
                    fieldWithPath("content.shippingAddress.content.state").description("Shipping Address , Field : State"),
                    fieldWithPath("content.shippingAddress.content.zipCode").description("Shipping Address , Field : zipCode"),
                    fieldWithPath("content.shippingAddress.message").description("Shipping Address , Status Message "),
                    fieldWithPath("content.shippingAddress.code").description("Shipping Address , Status Code"),

                    fieldWithPath("message").description("API Service Status Message"),
                    fieldWithPath("code").description("API Service Status Code")
                )))
            .andReturn();
        ObjectMapper responseObject = new ObjectMapper();
        Response<LocationResponse> response = responseObject.readValue(result.getResponse().getContentAsString(), Response.class);
        assertThat(StatusCode.E200.getCode().equals(response.getCode()));
        assertThat(StatusCode.E200.getMessage().equals(response.getMessage()));
/*        assertThat(StatusCode.E200.getCode().equals(response.getContent().getServiceAddress().getCode()));
        assertThat(StatusCode.E200.getMessage().equals(response.getContent().getServiceAddress().getMessage()));
        assertThat(StatusCode.E200.getCode().equals( response.getContent().getShippingAddress().getCode()));
        assertThat(StatusCode.E200.getMessage().equals(response.getContent().getShippingAddress().getMessage()));*/
    }


}
