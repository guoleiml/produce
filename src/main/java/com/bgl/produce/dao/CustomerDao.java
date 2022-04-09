package com.bgl.produce.dao;

import com.bgl.produce.bean.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerDao {
    List<Customer> selectAllCustomers();
}
