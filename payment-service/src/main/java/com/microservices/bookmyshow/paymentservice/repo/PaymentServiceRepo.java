package com.microservices.bookmyshow.paymentservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.bookmyshow.paymentservice.entity.PaymentHistory;

public interface PaymentServiceRepo extends JpaRepository<PaymentHistory, Integer>
{

}
