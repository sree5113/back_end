package com.mysql.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class dbinsert implements insert {

    @Autowired
    private JdbcTemplate jt;


    @Override
    public boolean createtable() {
        String sql_st = "create table emp(uid int, uname varchar(32),loc varchar(32));";
        jt.execute(sql_st);
        return true;
    }

     @Override
    public void insertData() {
        String sql_st = "insert into emp values(101,'sree','Bangalore'),(102,'teja','chennai'),(102,'harika','hyderbad');";
        jt.update(sql_st);
    }

    @Override
    public List readdata() {
        return jt.queryForList("desc emp;");
    }


}
