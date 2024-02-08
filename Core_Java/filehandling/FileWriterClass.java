package com.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

//FileWriter Class using in Charcter type data Format
public class FileWriterClass {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Data in File -->");
		String data=br.readLine();
		data=data+"\n";// we take '\n' because after we use store data on this file Data will on next Line
		
		FileWriter writer=new FileWriter("D:\\WriterDemo.txt", true);
		
		writer.write(data);//write method store a data in File 
		writer.close();//Close method close file after execution of program
		
		System.out.println("Data is Written --->");
		
	}

}
