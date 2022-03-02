package com.msd.SimpleInterestService.dao;

import com.msd.SimpleInterestService.model.PaymentsRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentsRequestRepository extends CrudRepository<PaymentsRequest, Long> {
}
