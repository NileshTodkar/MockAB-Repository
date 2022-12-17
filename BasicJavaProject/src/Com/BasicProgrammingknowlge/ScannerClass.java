package Com.BasicProgrammingknowlge;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String []args) {
		
		Scanner r= new Scanner(System.in);
		System.out.println("Enter Your name:");
		String FirstName=r.nextLine();
		System.out.println("Enter Your name:");
		char LastName=r.nextLine().charAt(0);
		System.out.println("Enter First No:");
		float a=r.nextFloat();
		System.out.println("Enter Second No:");
		int d=r.nextInt();
		System.out.println("Enter Third No:");
		double b=r.nextDouble();
		double c= a+b+d;
		System.out.println("Addition of A & B:" + c);
		
		System.out.println("name is"+LastName);
	}
	}


