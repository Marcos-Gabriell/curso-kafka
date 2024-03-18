package br.com.marcos.paymentservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.marcos.paymentservice.model.Payment;

public interface PaymentController {

	@PostMapping
	ResponseEntity<Payment> payment(@RequestBody Payment payment);
}
