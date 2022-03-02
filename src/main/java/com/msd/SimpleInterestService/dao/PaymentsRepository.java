package com.msd.SimpleInterestService.dao;

import com.msd.SimpleInterestService.model.Payments;
import org.springframework.data.repository.CrudRepository;

public interface PaymentsRepository extends CrudRepository<Payments, Long> {
}
