package br.com.marcos.paymentservice.service;

import org.springframework.stereotype.Service;

import br.com.marcos.paymentservice.model.Payment;

@Service
public interface PaymentService {

	void sendPayment(Payment payment);
}
