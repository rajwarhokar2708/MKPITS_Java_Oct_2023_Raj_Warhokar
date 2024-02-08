package com.mkpits.datetime;

import java.time.LocalDateTime;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;
import java.util.Set;


public class FormatedDateAndTimeClass {

	public static void main(String[] args) {
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("E,dd-MMM-yyyy HH:mm:ss");
		System.out.println(formatter);
		
		LocalDateTime dateTime=LocalDateTime.now();
		String formatted=formatter.format(dateTime);
		System.out.println(formatted);
		
		 Set<TemporalField> ok = formatter.getResolverFields();
		System.out.println(ok);
	}

}
