package com.mkpits.collection;

import java.util.Objects;

public class Student {
	public String name;
	public int iD;
	
	public Student(String name, int iD) {
		
		this.name = name;
		this.iD = iD;
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getiD() {
//		return iD;
//	}
//
//	public void setiD(int iD) {
//		this.iD = iD;
//	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", iD=" + iD + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(iD, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return iD == other.iD && Objects.equals(name, other.name);
	}
	
	
	
	
}
