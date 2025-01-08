package com.pro.crud.repo;

import com.pro.crud.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface cust_repo extends JpaRepository<Customer,Integer> {
}
