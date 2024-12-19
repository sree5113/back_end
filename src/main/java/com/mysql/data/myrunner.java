package com.mysql.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class myrunner implements ApplicationRunner {
    @Autowired
    dbinsert db;
    @Override
    public void run(ApplicationArguments args) throws Exception{
       // db.createtable();
        // db.insertData();
        List users= db.readdata();
        users.stream().forEach(user -> System.out.println(user));

    }
}
