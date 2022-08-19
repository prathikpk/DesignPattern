package com.Aurionpro.model;

public class Employee {

	public int id;
	public String name;
	public IRole role;

	public Employee(int id, String name, IRole role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
	}

	public void promote(IRole role) {
		this.role = role;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRole(IRole role) {
		this.role = role;
	}

	public String description() {
		return role.description();
	}

	public String responsibility() {
		return role.responsibility();
	}

	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + "]";
	}

}
