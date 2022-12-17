package com.Constructor;
import java.util.Scanner;
public class ClassA {
	
	public void method1() {
        
	}
	public static void main(String args []) {
		
		Scanner v=new Scanner(System.in);
		System.out.println("Enter the No:");
		int N1=v.nextInt();
		while (N1>0) {	
			int Reminder=N1%10;
			System.out.print(Reminder);
			N1=N1/10;
			
		}
		

		
	}

}
