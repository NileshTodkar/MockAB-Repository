package com.Logical_Programs;
import java.util.Scanner;
public class FactorialNumber {
	public static void main(String args []) {
		Scanner v= new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=v.nextInt();
		int j=1;
		for(int i=1;i<=a;i++) {
			 j=j*i;
			}
		System.out.println("Factorial Number of "+a+" is "+j);
	}

}
