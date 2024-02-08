package com.mkpits.enumpac;

public class CallingEnum2 {

	public static void main(String[] args) {
		for (DaysEnum string : DaysEnum.values()) {
			System.out.println(string+" "+string.day);
		}

	}

}
