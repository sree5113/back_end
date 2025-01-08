package com.mongo.db1.myrunner;

import com.mongo.db1.document.EmpDocument;
import com.mongo.db1.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    EmpDocument ed;

    @Override
    public void run(String... args) throws Exception {

        ed.save(new Employee(101,"Plvd","Sree",500000));
        //ed.save(new Employee(102,"Mysore","Priya",500000));

        //ed.deleteByEmpId(101);
    }
}
