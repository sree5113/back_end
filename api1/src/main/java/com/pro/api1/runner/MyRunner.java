package com.pro.api1.runner;

import com.pro.api1.model.Employee;
import com.pro.api1.repo.emp_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    emp_repo er;

    @Override
    public void run(String... args) throws Exception {

        er.save(new Employee(7,"gopi", 34000));
       /* er.save(new Employee("sree",400000));
        er.save(new Employee("vasu",100000));
        er.save(new Employee("sreeja",40000));
        er.save(new Employee("sai",40000));
        er.save(new Employee("meena",200000));
        er.save(new Employee("",120000));*/

      // er.findAll().forEach(System.out::println);

        //er.findAllByEmpnameLike("s%").forEach(System.out::println);
    }
}
