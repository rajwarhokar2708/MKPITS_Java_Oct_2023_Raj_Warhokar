package com.mkpits.nestedclass;

public class OuterClass
	{
	int num1=50;
	
	
	
	public class InnerClass
	{
		public class AnotherInnerClass{
			int num2=50;
			void getData()
			{
				System.out.println("Inner Class Method called Succesfully ");
			}
		}
	}
}
