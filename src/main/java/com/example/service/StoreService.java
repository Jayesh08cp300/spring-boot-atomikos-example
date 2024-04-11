package com.example.service;

import com.example.entity.customer.Customer;
import com.example.entity.order.Order;
import com.example.exception.NoRollbackException;
import com.example.exception.StoreException;

public interface StoreService {

	void store(Customer customer, Order order) throws Exception;

	void storeWithStoreException(Customer customer, Order order) throws StoreException;

	void storeWithNoRollbackException(Customer customer, Order order) throws NoRollbackException;

}