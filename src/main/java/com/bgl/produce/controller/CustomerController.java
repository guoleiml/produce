package com.bgl.produce.controller;

import com.bgl.produce.bean.Customer;
import com.bgl.produce.bean.ResponeData;
import com.bgl.produce.service.ICustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CustomerController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ICustomerService customerService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/selectAllClusters")
    @ResponseBody
    public ResponeData selectAllClusters(){
        ResponeData responeData = new ResponeData();
        List<Customer> customers = customerService.selectAllCustomers();
        responeData.setCode(0);
        responeData.setCount(customers.size());
        responeData.setData(customers);
        logger.info("customers=={}", customers);
        return responeData;
    }

    @RequestMapping("/addCustomer")
    @ResponseBody
    public ResponeData addCustomer(HttpServletRequest request){
        ResponeData responeData = new ResponeData();
        responeData.setCode(0);
        logger.info("GL --------- ENTER");
        return responeData;
    }

}
