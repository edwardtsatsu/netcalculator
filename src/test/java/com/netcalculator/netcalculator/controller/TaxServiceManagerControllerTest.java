package com.netcalculator.netcalculator.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.netcalculator.netcalculator.request.ClientRequest;
import com.netcalculator.netcalculator.response.ClientResponse;
import com.netcalculator.netcalculator.service.TaxServiceManger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = TaxServiceManagerController.class)
@ExtendWith(SpringExtension.class)
class TaxServiceManagerControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private TaxServiceManger taxServiceManger;


    private ClientRequest clientRequest;

    @BeforeEach
    void setUp() {
        clientRequest = new ClientRequest(2703.47, 850.00);
    }

    @Test
    void shouldGetAllDetailsTest() throws Exception {
        ClientResponse clientResponse = ClientResponse.builder()
                                                      .grossSalary(3400.591194968553)
                                                      .totalTaxPayeTax(427.7473201218305)
                                                      .basicSalary(2550.591194968553)
                                                      .employeePensionContributionAmount(357.06207547169805)
                                                      .employerPensionAmount(612.1064150943395)
                                                      .build();
        when(taxServiceManger.getRequiredDetails(clientRequest.getNet(), clientRequest.getAllowance())).thenReturn(clientResponse);
        mockMvc.perform(post("/api/v1/calculate-net").contentType(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsString(clientRequest)).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andExpect(result -> assertThat(result.getResponse().getContentAsString()).isEqualTo(objectMapper.writeValueAsString(taxServiceManger.getRequiredDetails(clientRequest.getNet(), clientRequest.getAllowance()))));
    }
}