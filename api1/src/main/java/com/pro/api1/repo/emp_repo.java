package com.pro.api1.repo;

import com.pro.api1.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface emp_repo extends JpaRepository<Employee,Integer> {

    //List<Employee> findAllByEmpnameLike(String pat);
}
