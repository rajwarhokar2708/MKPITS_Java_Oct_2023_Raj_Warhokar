package com.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

//FileReader Class using in Charcter type data Format

public class FileReaderClass {

	public static void main(String[] args) throws Exception {
		FileReader reader=new FileReader("D:\\WriterDemo.txt");
		//Using FileReader Constructor take a path and store in object
		BufferedReader br=new BufferedReader(reader);
		String data="";
		
		while((data=br.readLine())!= null) {
			System.out.print(data);
		}
		reader.close();//Close method close file after execution of program
	
	}

}
