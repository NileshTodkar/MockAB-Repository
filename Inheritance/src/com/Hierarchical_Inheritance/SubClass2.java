package com.Hierarchical_Inheritance;

public class SubClass2 extends SuperClass {
	public void Method3() {
		int d=a/b;
		System.out.println(d);
		
	}
	public static void main(String args []) {
		SubClass2 v= new SubClass2();
		v.Method1();
		v.Method3();
		
		
	}
}
