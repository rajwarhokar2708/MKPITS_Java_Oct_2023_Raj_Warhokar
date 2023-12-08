package com.mkpits.method;

public class MethodDeclaration {

	public static void main(String[] args) {
		//Calling by direct method
		//Static method can not be delocate the data
		//Their is a three way to call static method 
		//1)deirect call 2)Using Class_Name.method_Name 3)using Object and instance
		getFirstName();
		getLastName();
		getEmail();
		getMobile();
		getGender();
		getPassword();
	}
	public static void getFirstName() {
		String name="Raj";
		System.out.println("First name :-"+name);
	}
	public static void getLastName() {
		String lastName="Kumar";
		System.out.println("Last Name :-"+lastName);
	}
	public static  void getEmail() {
		String email="kumarraj@gmail.com";
		System.out.println("Email ID:-"+email);
	}
	public static void getMobile() {
		long mobile=9355685369l;
		System.out.println("Mobile Number :-"+mobile);
	}
	public static void getGender() {
		String gender="Male";
		System.out.println("Gender :-"+gender);
	}
	public static void getPassword() {
		String password="raj@456";
		System.out.println("Password :-"+password);
	}
	public static void getAllData() {
		getFirstName();
		getLastName();
		getEmail();
		getMobile();
		getGender();
		getPassword();
	}
}
