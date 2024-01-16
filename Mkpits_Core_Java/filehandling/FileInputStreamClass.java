package com.mkpits.filehandling;

import java.io.FileInputStream;
import java.io.IOException;

//FileInputStream Class using in byte type data Format
public class FileInputStreamClass
{

	public static void main(String[] args) throws IOException
	{
	FileInputStream fis=new FileInputStream("D:\\Demo.txt");
	//Using FileInputStream Constructor take a path of file and store in object
	int b=0;
	while((b=fis.read())!=-1) //this condition itreate till incoming data will be equal to -1
	{
		System.out.print((char)b);//in this print method we type cast the data in charcter
	}
	fis.close();//Close method close file after execution of program
	
	}

}
