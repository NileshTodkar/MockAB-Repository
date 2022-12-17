package com.GetAndSet;

public class ClassGetDate {
	String Day;
	int Date;
	int Year;
	ClassGetDate(String Day,int Date,int Year){
		this.Day=Day;
		this.Date=Date;
		this.Year=Year;
	}
public static void main(String args []) {
	
	ClassGetDate v=new ClassGetDate("Monday",15,2022);
	System.out.println(v.Day);
	System.out.println(v.Date);
	System.out.println(v.Year);
}
}