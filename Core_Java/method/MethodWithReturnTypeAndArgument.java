package com.mkpits.method;

public class MethodWithReturnTypeAndArgument {

	public static void main(String[] args) {
		MethodWithReturnTypeAndArgument mWRTAA=new MethodWithReturnTypeAndArgument();
		String data=mWRTAA.details(1,10000);
		System.out.println(data);
		
		String data1= mWRTAA.getData(2,50000);
		System.out.println(data1);
	}

	public String getData(int id, int salary) {
		double incentive=salary+(salary*0.01);
		String detail="Id:"+id+"\nSalary with Incentive :"+incentive;
		return detail+(incentive);
		
	}

	public String details(int id, int salary) //
	{
		double incentive=salary+(salary*0.01);
		String details1="Id:"+id+"\nSalary with Incentive :"+incentive;
		return details1;
	}

}
