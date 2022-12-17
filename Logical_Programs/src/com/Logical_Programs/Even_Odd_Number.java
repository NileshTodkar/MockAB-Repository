package com.Logical_Programs;

public class Even_Odd_Number {
	public static void main(String args []) {
		System.out.print("Even No = ");
		for(int a=1;a<=50;a++) {
		if(a%2==0) {
		
			System.out.print(a+", ");
		}
		
		}
		System.out.println(" ");
		System.out.print("odd No = ");
		for(int b=1;b<=50;b++) {
		if(b%2!=0) {
			
			System.out.print(b+", ");
		}
		}
	}

}
