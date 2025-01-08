package com.pro.crud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "customer_tab")
public class Customer {
    @Id
    @Column(name = "cust_id")
    private Integer id;
    @Column(name = "cust_name")
    private String name;
    @Column(name = "cust_loc")
    private String loc;

    public Customer() {
        super();
    }

    public Customer(Integer id) {
        this.id = id;
    }

    public Customer(String loc, String name) {
        this.loc = loc;
        this.name = name;
    }

    public Customer(Integer id, String loc, String name) {
        this.id = id;
        this.loc = loc;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}
