package com.example.Ecom.servicee.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Ecom.Repository.PaymentRepository;
import com.example.Ecom.entity.Payment;
import com.example.Ecom.service.PaymentService;


@Service
public class PaymentServiceImpl implements PaymentService{
	
	 @Autowired
	    private PaymentRepository paymentRepository;

	    @Override
	    public Payment makePayment(Payment payment) {

	        payment.setPaymentDate(LocalDateTime.now());
	        payment.setStatus("SUCCESS");

	        return paymentRepository.save(payment);
	    }

}
