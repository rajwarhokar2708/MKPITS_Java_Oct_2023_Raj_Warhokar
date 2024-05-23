package com.mkpits.revision;

import java.util.ArrayList;
import java.util.List;

public class RevisionProgram2 {

	public static void main(String[] args) {
		List<String> nameList=new ArrayList<String>();
		nameList.add("Raj");
		nameList.add("Pranav");
		nameList.add("harsh");
		nameList.add("Kausthub");
		
		System.out.println(nameList);
		
		nameList.set(2, "gupta");
		
		System.out.println(nameList);
	}

}
