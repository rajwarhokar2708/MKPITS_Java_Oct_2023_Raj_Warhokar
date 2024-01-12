package com.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileOutputStreamClass {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Data to be wriiten");
		String data=br.readLine();
		data=data+"\n";
		
		FileOutputStream fos=new FileOutputStream("D:\\Demo.txt", true);
		byte b[]=data.getBytes();
		fos.write(b);
		fos.close();
		System.out.println("Data is Written");
		
	}

}
