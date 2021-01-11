package com.xabia.demo.vaccine.model;

import java.util.Arrays;
import java.util.List;

public class PaymentOptions {

	private static final List<String> paymentOptions = Arrays.asList("CASH", "CREDIT", "FAWRY");
	
	public static List<String> getPaymentOptions(){
		return paymentOptions;
	}

}
