package com.mongo.db1.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Employee {

    @Id

   private Integer empId;
    private String empName;
   private String empLoc;
    private Integer empSal;

    public Employee() {
        super();
    }

    public Employee(Integer empId) {
        this.empId = empId;
    }

    public Employee(String empLoc, String empName, Integer empSal) {
        this.empLoc = empLoc;
        this.empName = empName;
        this.empSal = empSal;
    }

    public Employee(Integer empId, String empLoc, String empName, Integer empSal) {
        this.empId = empId;
        this.empLoc = empLoc;
        this.empName = empName;
        this.empSal = empSal;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpLoc() {
        return empLoc;
    }

    public void setEmpLoc(String empLoc) {
        this.empLoc = empLoc;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpSal() {
        return empSal;
    }

    public void setEmpSal(Integer empSal) {
        this.empSal = empSal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empLoc='" + empLoc + '\'' +
                ", empSal=" + empSal +
                '}';
    }
}
