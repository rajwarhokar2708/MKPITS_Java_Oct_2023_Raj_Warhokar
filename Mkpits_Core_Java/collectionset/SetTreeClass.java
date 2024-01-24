package com.mkpits.collectionset;

import java.util.ArrayList;

import com.mkpits.array.ForEachArray;

public class SetTreeClass {
	String data;
	ArrayList<SetTreeClass>  children;
	
	public SetTreeClass(String data) {
		this.data=data;
		this.children=new ArrayList<SetTreeClass>();
	}
	
	void child(SetTreeClass node) {
		this.children.add(node);
	}
	
	String print(int level) {
		String rep="  ".repeat(level)+data+"\n";
		for (SetTreeClass setTreeClass : children) {
			rep += setTreeClass.print(level+1);
		}
		
		return rep;
		
	}
}
