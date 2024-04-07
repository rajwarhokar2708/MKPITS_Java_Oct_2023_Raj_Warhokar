package com.mkpits.exception;

public class Banking {

	public static void main(String[] args) {
		square(-1);
		square(10);
	}
	static void square(int amo) {
		try {
			
			if(amo<0) {
				throw new LessBalanceException();
			}
			else
			{
				System.out.println("Square of is :"+(amo*amo));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
