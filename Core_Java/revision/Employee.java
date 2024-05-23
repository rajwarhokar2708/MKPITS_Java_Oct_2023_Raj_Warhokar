package com.mkpits.revision;

public class Employee {

	int id;
	String Name;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + "]";
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

}
