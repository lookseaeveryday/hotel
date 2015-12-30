package com.hotel.model;

import java.io.Serializable;

public class UserModel implements Serializable {

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	
	private static final long serialVersionUID = 2142035439724429054L;

	
	private Integer id;
	private String age;
	private String name;
	
	public UserModel() {
	}
	
	public String getAge() {
		return age;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
