package com.example.controller;

import com.example.entity.customer.Customer;
import com.example.entity.order.Order;
import com.example.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StoreController {

	@Autowired
	private StoreService storeService;

	@GetMapping("/store")
	public String store() throws Exception {
		Customer customer = new Customer();
		customer.setName("Jayesh");
		customer.setAge(30);

		Order order = new Order();
		order.setCode(100);
		order.setQuantity(1000);

		storeService.store(customer, order);

		return "store - Done";
	}

	@GetMapping("/storeWithStoreException")
	public String storeWithStoreException() throws Exception {
		Customer customer = new Customer();
		customer.setName("Amit");
		customer.setAge(20);

		Order order = new Order();
		order.setCode(200);
		order.setQuantity(2000);

		storeService.storeWithStoreException(customer, order);

		return "storeWithStoreException - Done";
	}

	@GetMapping("/storeWithNoRollbackException")
	public String storeWithNoRollbackException() throws Exception {
		Customer customer = new Customer();
		customer.setName("Rahul");
		customer.setAge(30);

		Order order = new Order();
		order.setCode(300);
		order.setQuantity(3000);

		storeService.storeWithNoRollbackException(customer, order);

		return "storeWithNoRollbackException - Done";
	}
}
