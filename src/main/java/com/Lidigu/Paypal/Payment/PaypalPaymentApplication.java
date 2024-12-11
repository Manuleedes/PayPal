package com.Lidigu.Paypal.Payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableMBeanExport;

@SpringBootApplication
@EnableMBeanExport
public class PaypalPaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaypalPaymentApplication.class, args);
	}

}
