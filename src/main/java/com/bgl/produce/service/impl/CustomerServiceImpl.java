package com.bgl.produce.service.impl;

import com.bgl.produce.bean.Customer;
import com.bgl.produce.dao.CustomerDao;
import com.bgl.produce.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerDao customerDao;
    @Override
    public List<Customer> selectAllCustomers() {
        return customerDao.selectAllCustomers();
    }
}
