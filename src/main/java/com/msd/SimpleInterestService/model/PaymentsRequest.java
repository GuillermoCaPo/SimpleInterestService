package com.msd.SimpleInterestService.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Builder
public class PaymentsRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Amount should not be null.")
    @Min(value = 1, message = "Amount should be greater than 0.")
    private Double amount;

    @NotNull(message = "Terms should not be null.")
    @Min(value = 2, message = "Terms should be greater than 1.")
    private Integer terms;

    @NotNull(message = "Rate should not be null.")
    @DecimalMin(value = "0.01111111111111111111111111111111111111111111", message = "Rate should be greater than 0.01.")
    @DecimalMax(value = "0.99999999999999999999999999999999999999999999", message = "Rate should be smaller than 1.00.")
    private Double rate;
}
