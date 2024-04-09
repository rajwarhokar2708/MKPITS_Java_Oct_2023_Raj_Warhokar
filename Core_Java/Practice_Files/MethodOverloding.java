package com.mkpits.method;

public class MethodOverloding {
	int x,y;
	public static void main(String[] args) {
		MethodOverloding mo=new MethodOverloding();
		
		mo.getData();
		System.out.println("----------------------------");
		mo.getData(5);
		mo.getData("Sahil","Bodkhe",1548465l);
		mo.getData("Plot no.98,Mankapur,Nagpur","sahilbodkhe@gmail.com","shat@123");
		mo.getData(440030,45000.00f);
	}
	
	
	
	//Method Overloding 
	
	private void getData(String address,String email,String password) {
		System.out.println("Address :"+address+"\nEmail :"+email+"\nPassword :"+password);
	}

	private void getData(int pinCode, float salary) {
		System.out.println("Pincode :"+pinCode+"\nSalary :"+salary);
		
	}

	private void getData(String fName, String lName,long mobileNo) {
		System.out.println("First Name:"+fName+"\nLast Name :"+lName+"\nMobile Number :"+mobileNo);
		
	}

	private void getData(int id) {
		System.out.println("Id :"+id);
		
	}

	private void getData() {
		System.out.println("Detail of employee :-");
		
	}
	
}
