/* Copyright © 2015 Oracle and/or its affiliates. All rights reserved. */
package com.example.employees;

import java.util.concurrent.atomic.AtomicLong;

/**
 *
 * @author luperalt
 */
public class Employee {

	private String username;
	private int id;
	private int age;
	private String firstName;
	private String lastName;
	private String city;
    private static final AtomicLong counter = new AtomicLong(100);
    
    

    public Employee(String username, int id, int age, String firstName, String lastName, String city) {
		//super();
		this.username = username;
		this.id = id;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
	}
    
    public Employee(String username, int age, String firstName, String lastName, String city) {
		//super();
		this.username = username;
		
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.id = (int) counter.incrementAndGet();
	}

    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public static AtomicLong getCounter() {
		return counter;
	}

	@Override
    public String toString() {
        return "Employee{" + "id=" + id + ", firstname=" + firstName + 
                ", lastName=" + lastName + ", city=" + city + 
                ", age=" + age + ", username=" + username + '}';
    }

    
}
