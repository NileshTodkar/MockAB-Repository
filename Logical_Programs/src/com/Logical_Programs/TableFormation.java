package com.Logical_Programs;
import java.util.Scanner;
public class TableFormation {
	public static void main(String args []) {
		Scanner v =new Scanner(System.in);
		System.out.println("Enter the Table no :");
		int a=v.nextInt();
		int b;
		for(int i=1;i<=10;i++) {
			b=a*i;
			System.out.println(b);
			
			
		}
		
	}

}
