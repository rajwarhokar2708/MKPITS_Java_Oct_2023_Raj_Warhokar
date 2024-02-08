package com.mkpits.constructor;

	public class ConstructorObject {

		int pinCode, id;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ConstructorObject object = new ConstructorObject();
			object.getMember();


			ConstructorObject object2 = new ConstructorObject(440034, 2301);//Passing Argument
			object2.getMember(); 

			ConstructorObject object3 = new ConstructorObject(object2);
			object3.getMember();//Object to Object Casting Data
			

		}

		public void getMember() {
			System.out.println("Id is :- "+id + " Pincode is :- "+pinCode);
		}

		public ConstructorObject()//Non Parameterizes Constructor
		{
			pinCode = 440030;
			id = 152;
			System.out.println("Constructor with no Arguement");
		}
		public ConstructorObject(int p, int i) //Parameterizes Construtor
		{

			pinCode = p;
			id = i;
			System.out.println("Parameterised Constructor");
		}


		public ConstructorObject(ConstructorObject o) {
			// TODO Auto-generated constructor stub
			System.out.println("Contructor with Object");
			pinCode = o.pinCode;
			id = o.id;
		}
	}	