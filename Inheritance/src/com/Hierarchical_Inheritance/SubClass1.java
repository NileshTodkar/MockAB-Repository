package com.Hierarchical_Inheritance;

public class SubClass1 extends SuperClass {
	
	public void Method2() {
		int c=a*b;
		System.out.println("c=" + c);
		
		
	}
	public static void main(String args []) {
		SubClass1 v= new SubClass1();
		v.Method1();
		v.Method2();
		
		
	}

}
