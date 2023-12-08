package com.mkpits.method;

class MethodWithReturnTypeAndArgument_2{
	
	public static void main(String[] args) {
		MethodWithReturnTypeAndArgument_2 ex=new MethodWithReturnTypeAndArgument_2();
		String data=ex.getData(1,50000,2,40000,3,80000);//Called (Argument) 
		System.out.println(data);
	}
	
	public String getData(int id, int salary,int id2,int salary2,int id3,int salary3 )//Calling(Parameter) 
	{
		String incentive=salary+(salary*0.01)+"\n";
		String detail="Id:"+id+"\nSalary with Incentive :"+incentive;
		
		String incentive1=salary2+(salary2*0.02)+"\n";
		String detail1="Id:"+id2+"\nSalary with Incentive :"+incentive1;
		
		String incentive2=salary3+(salary3*0.05)+"\n";
		String detail2="Id:"+id3+"\nSalary with Incentive :"+incentive2;
		return detail+detail1+detail2;
	}
}