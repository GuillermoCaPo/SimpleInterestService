package com.msd.SimpleInterestService.service;

import com.msd.SimpleInterestService.dao.PaymentsRequestRepository;
import com.msd.SimpleInterestService.dao.PaymentsRepository;
import com.msd.SimpleInterestService.model.Payments;
import com.msd.SimpleInterestService.model.PaymentsRequest;
import com.msd.SimpleInterestService.model.PaymentsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentsService {

    private final PaymentsRequestRepository paymentsRequestRepository;
    private final PaymentsRepository paymentsRepository;

    public PaymentsResponse process(PaymentsRequest paymentsRequest) {

        BigDecimal weeklyAmount = new BigDecimal(
                ((paymentsRequest.getAmount() * paymentsRequest.getRate()) + paymentsRequest.getAmount())
                        / Double.parseDouble(paymentsRequest.getTerms() + ""));

        weeklyAmount = weeklyAmount.setScale(2, RoundingMode.HALF_UP);
        List<Payments> payments = new ArrayList<>();
        LocalDate date = LocalDate.now();


        PaymentsRequest paymentsRequestTmp = paymentsRequestRepository.save(paymentsRequest);

        for(int i = 1; i <= paymentsRequest.getTerms(); i++) {
            date = date.plus(7, ChronoUnit.DAYS);
            payments.add(Payments.builder()
                                 .paymentRequestId(paymentsRequestTmp.getId())
                                 .amount(weeklyAmount.doubleValue())
                                 .paymentNumber(i)
                                 .paymentDate(date)
                                 .build());
        }


        paymentsRepository.saveAll(payments);
        return PaymentsResponse.builder()
                                .payments(payments)
                                .build();

    }

}
