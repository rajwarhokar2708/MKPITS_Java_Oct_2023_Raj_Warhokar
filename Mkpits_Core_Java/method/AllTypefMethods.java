package com.mkpits.method;

public class AllTypefMethods {

	public static void main(String[] args) {
		AllTypefMethods obj=new AllTypefMethods();
		
		obj.uName();//Non static method calling by object (only)
		
		uEmail();// Static method calling direct 
		obj.uEmail();//Static method calling by object
		new AllTypefMethods().uEmail();;//Static method calling by instance
		AllTypefMethods.uEmail();//Static method calling by ClassName.variableName
		
		long password=obj.uPassword();//calling method return-type no argument 
		System.out.println(password);
		
		obj.getPinCode(440030);//Calling method argument with parameter no return-type
		
		String movie=obj.getMovie("Animal");//calling method with return-type with argument and parameter
		System.out.println(movie);
	}

	public String getMovie(String movie) {
		String boxOffice="Movie Name :"+movie;
		return boxOffice;
	}

	public  void getPinCode(int pinCode) {
		System.out.println("Pin Code :"+pinCode);
	}

	public long uPassword() {
		long password=963258741l;
		return password;
		
	}

	public static void uEmail() {
	System.out.println("rajwarhokar@gmail.com");
		
	}

	public void uName() //Method with no argument no return-type no Parameter
	{
		System.out.println("Raj");
		
	}
	public void allData() {
		uName();
		uEmail();
		uPassword();
		getMovie("Animal");
	}
	
}
