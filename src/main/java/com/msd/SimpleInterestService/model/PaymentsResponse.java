package com.msd.SimpleInterestService.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PaymentsResponse {

    private List<Payments> payments;

}
