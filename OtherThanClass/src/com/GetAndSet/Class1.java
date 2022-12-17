package com.GetAndSet;
import java.util.Scanner;
public class Class1 {
public static void main(String args [] ) {
	
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter Name :");
	String Name=obj.nextLine();
	System.out.println("Enter Fees :");
	int Fee=obj.nextInt();
	System.out.println("The name is "+Name +" & Fees are "+ Fee);
}
}
