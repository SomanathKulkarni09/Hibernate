package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // this is use for the primary key 
	private int emp_id;
	private int age;
	private String name;
	private String city;

	public Employee(int emp_id, int age, String name, String city) {
		super();
		this.emp_id = emp_id;
		this.age = age;
		this.name = name;
		this.city = city;
	}

	public Employee() {

	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", age=" + age + ", name=" + name + ", city=" + city + "]";
	}

}
