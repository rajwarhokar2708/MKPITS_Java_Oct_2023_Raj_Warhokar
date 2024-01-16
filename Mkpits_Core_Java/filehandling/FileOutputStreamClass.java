package com.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//FileOututStream Class using in byte type data Format
public class FileOutputStreamClass {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Data to be wriiten");
		String data=br.readLine();
		data=data+"\n";// we take '\n' because after we use store data on this file Data will on next Line
		
		FileOutputStream fos=new FileOutputStream("D:\\Demo.txt", true);
		/*Using FileOutputStream Constrctor Create new file in Drive 
			If File is alreday exit then it take data on that existing File
			and true is append it works data continously put on file 
			if we use false it flush existing data and put new data in file*/
		
		byte b[]=data.getBytes();//Byte method Take a byte data and store a data in array format
		fos.write(b);//Write method write a data in File
		fos.close();//using close method we close the file
		System.out.println("Data is Written");
		
	}

}
