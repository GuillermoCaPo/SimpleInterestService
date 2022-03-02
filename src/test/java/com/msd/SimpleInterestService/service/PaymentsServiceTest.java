package com.msd.SimpleInterestService.service;

import com.msd.SimpleInterestService.config.TestConfig;
import com.msd.SimpleInterestService.model.PaymentsRequest;
import com.msd.SimpleInterestService.model.PaymentsResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
public class PaymentsServiceTest {

    @Autowired
    private PaymentsService paymentsService;

    @Test
    public void shouldProcessAPaymentRequest() {
        PaymentsResponse paymentsResponse =
                paymentsService.process(PaymentsRequest.builder().amount(8000.80).rate(0.20).terms(8).build());

        System.out.println(paymentsResponse.toString());
    }
}
