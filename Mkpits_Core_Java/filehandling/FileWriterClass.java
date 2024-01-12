package com.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileWriterClass {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Data in File -->");
		String data=br.readLine();
		data=data+"\n";
		
		FileWriter writer=new FileWriter("D:\\WriterDemo.txt", true);
		writer.write(data);
		writer.close();
		
		System.out.println("Data is Written --->");
		
	}

}
