package com.ticlyde.rest;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ticlyde.model.Customer;

@RestController
public class CustomerController {

	@RequestMapping("/getCustomer")
	public Customer register(@RequestParam(value = "id", defaultValue = "1") long customerId) {
		Customer customer = new Customer();
		customer.setBirthdate(new Date());
		customer.setId(customerId);
		customer.setFirstName("Euclyde");
		customer.setLastName("Joubert");
		return customer;
	}
}
