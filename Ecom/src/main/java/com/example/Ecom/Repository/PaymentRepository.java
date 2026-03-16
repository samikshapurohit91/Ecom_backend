package com.example.Ecom.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Ecom.entity.Payment;

public interface PaymentRepository  extends JpaRepository<Payment, Long> {

}
