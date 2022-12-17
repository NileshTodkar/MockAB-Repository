package com.myintroduction;

public class Variable_Types {
	static int Int =20;//static variable
	public static void Method1() {
		//local variable
		System.out.println(Int);
		
		
	}	
	public void Method2() {
		
		System.out.println(Int);
	}
	
	public static void main(String [] args){ 
		Variable_Types a=new Variable_Types ();
		
		a.Method2();
		
        Method1();
		
		
		
		
	}

}
