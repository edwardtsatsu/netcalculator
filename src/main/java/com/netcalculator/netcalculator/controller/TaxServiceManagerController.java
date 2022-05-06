package com.netcalculator.netcalculator.controller;

import com.netcalculator.netcalculator.request.ClientRequest;
import com.netcalculator.netcalculator.response.ClientResponse;
import com.netcalculator.netcalculator.service.TaxServiceManger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/calculate-net")
public class TaxServiceManagerController {
    private final TaxServiceManger taxServiceManger;

    public TaxServiceManagerController(TaxServiceManger taxServiceManger) {
        this.taxServiceManger = taxServiceManger;
    }

    @PostMapping
    public ResponseEntity<ClientResponse> getAllDetails(@RequestBody ClientRequest clientRequest) {
        return new ResponseEntity<>(taxServiceManger.getRequiredDetails(clientRequest.getNet(), clientRequest.getAllowance()), HttpStatus.OK);
    }
}