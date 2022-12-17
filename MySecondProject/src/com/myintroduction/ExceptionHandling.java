package com.myintroduction;

public class ExceptionHandling {
	public static void main(String args [] ) {
		
		try { 
			try {
				   int a=10;
		           int b= 10;
		           int c=a/b;}
		           catch(Exception f ) {}
			
		} 
		catch(ArithmeticException f){
			   f.printStackTrace();
			//	System.out.println(e);
				//System.out.println(e.getMessage());
			}
		catch(Exception e){
		   e.printStackTrace();
		//	System.out.println(e);
			//System.out.println(e.getMessage());
		}
		
		
		finally {
			System.out.println("Hello");
			
		}
		System.out.println("Nilesh");
		System.out.println("Nikhil");
		System.out.println("Laxmi");
	}

}
