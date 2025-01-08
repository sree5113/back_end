package com.pro.api1.model;


import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue
    @Column(name = "emp_int")
    private Integer emp_int;
    @Column(name = "empname")
    private String empname;
    @Column(name = "emp_sal")
    private Integer emp_sal;

    public Employee() {
        super();
    }

    public Employee(Integer emp_int) {
        this.emp_int = emp_int;
    }

    public Employee(String empname, Integer emp_sal) {
        this.empname = empname;
        this.emp_sal = emp_sal;
    }

    public Employee(Integer emp_int, String empname, Integer emp_sal) {
        this.emp_int = emp_int;
        this.empname = empname;
        this.emp_sal = emp_sal;
    }

    public Integer getEmp_int() {
        return emp_int;
    }

    public void setEmp_int(Integer emp_int) {
        this.emp_int = emp_int;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public Integer getEmp_sal() {
        return emp_sal;
    }

    public void setEmp_sal(Integer emp_sal) {
        this.emp_sal = emp_sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_int=" + emp_int +
                ", emp_name='" + empname + '\'' +
                ", emp_sal=" + emp_sal +
                '}';
    }
}
