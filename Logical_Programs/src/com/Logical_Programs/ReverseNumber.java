package com.Logical_Programs;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String args []) {
		   Scanner v =new Scanner(System.in);
		   System.out.println("Enter the no :");
		int a=v.nextInt();
		int b=a;
		int Riminder;
		int sum=0;
		
		while(a>0) {
			Riminder=a%10;
			sum=(sum*10)+Riminder;
			a=a/10;
			}
		System.out.println(sum +" is a reverse no of "+b);
	}

}
