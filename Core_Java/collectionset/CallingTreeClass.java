package com.mkpits.collectionset;

class CallingTreeClass {

	public static void main(String[] args) {
		SetTreeClass drink=new SetTreeClass("Drink");
		SetTreeClass hot=new SetTreeClass("Hot");
		SetTreeClass cold=new SetTreeClass("Cold");
		SetTreeClass tea=new SetTreeClass("Tea");
		SetTreeClass coffe=new SetTreeClass("Coffe");
		SetTreeClass greenTea=new SetTreeClass("Green Tea");
		SetTreeClass oldMonk=new SetTreeClass("OLd Monk");
		SetTreeClass beer=new SetTreeClass("Beer");
		SetTreeClass pepsi=new SetTreeClass("Pepsi");
		
		drink.child(hot);
		drink.child(cold);
		
		hot.child(tea);
		hot.child(coffe);
		hot.child(greenTea);
		
		cold.child(oldMonk);
		cold.child(beer);
		cold.child(pepsi);
		
		
		System.out.println(drink.print(0));
		

	}

}
