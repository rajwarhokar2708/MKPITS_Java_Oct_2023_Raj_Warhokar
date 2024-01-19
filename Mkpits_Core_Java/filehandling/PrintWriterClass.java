package com.mkpits.filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Print Writer shows the data on site and concole 
		PrintWriter pw=new PrintWriter(System.out,true);//And this true is for flush the file and 
		//if we did not use true then we want use flush method 
		pw.println("Hiii-->");
		pw.close();
//		pw.flush();
		
		pw=new PrintWriter(new FileWriter("D:\\Demo.txt",true),true);//First true For if File
		//is not exist in device it create and save data and secound true is for after execution flush the pipeline 
		pw.println("Hello");
		pw.close();
//		pw.flush();
	}

}
