package com.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderClass {

	public static void main(String[] args) throws Exception {
		FileReader reader=new FileReader("D:\\WriterDemo.txt");
		BufferedReader br=new BufferedReader(reader);
		String data="";
		
		while((data=br.readLine())!= null) {
			System.out.print(data);
		}
		reader.close();
	
	}

}
