package com.msd.SimpleInterestService.controller;

import com.msd.SimpleInterestService.model.PaymentsRequest;
import com.msd.SimpleInterestService.service.PaymentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentsController {

    private final PaymentsService paymentsService;

    @PostMapping
    @ResponseStatus(OK)
    public Object get(@RequestBody @Valid PaymentsRequest paymentsRequest) {
        return paymentsService.process(paymentsRequest);
    }
}
