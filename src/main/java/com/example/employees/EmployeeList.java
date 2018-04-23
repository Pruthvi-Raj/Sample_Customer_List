/* Copyright � 2015 Oracle and/or its affiliates. All rights reserved. */
package com.example.employees;

import java.util.ArrayList;
import java.util.List;


public class EmployeeList {
    private static final List<Employee> employeeList = new ArrayList();
    
    private EmployeeList(){
    }
    
    static{
        employeeList.add(new Employee("James123", 001, 25, "James", "Franco", "Boston"));
        employeeList.add(new Employee("JamesOnFire", 001, 25, "James", "Franco", "Boston"));
        employeeList.add(new Employee("Knight27", 002, 21, "John", "Legend", "San Jose"));
        employeeList.add(new Employee("Ninja09", 003, 24, "James", "Bond", "New York"));
        employeeList.add(new Employee("FirceAndIce", 004, 28, "John", "Joseph", "Los Angeles"));
        employeeList.add(new Employee("Panda64", 005, 26, "Edward", "Franco", "Las Vegas"));
        employeeList.add(new Employee("LightSaber97", 007, 32, "Rajesh", "Kuthrapelli", "Chicago"));
    }
    
    public static List <Employee> getInstance(){
        return employeeList;
    }
}
