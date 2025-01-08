package com.mongo.db1.document;

import com.mongo.db1.model.Employee;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;


@Document
public interface EmpDocument extends MongoRepository<Employee, Integer> {
    //void deleteByEmpId(Integer ID);
}
