package com.pro.crud.runner;

import com.pro.crud.model.Customer;
import com.pro.crud.repo.cust_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    cust_repo cr;
    @Override
    public void run(String... args) throws Exception {
        cr.save(new Customer(4,"modi","delhi"));
    }
}
