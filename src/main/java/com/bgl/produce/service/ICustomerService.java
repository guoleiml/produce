package com.bgl.produce.service;

import com.bgl.produce.bean.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> selectAllCustomers();
}
