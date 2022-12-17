package com.GetAndSet;

public class New_Class {
	public void test(int a, int b) {
	    if (a==1) {
	        System.out.println("A");
	    } 
	    else if (a==1 && b==2) {
	        System.out.println("A && B");
	    } 
	    else 
	    {
	    	System.out.println("not ok");  
	    }
	
	if (b!=2) {
        System.out.println("!B");
    } 
    else {
        System.out.println("None");
    }
	}
	
	public static void main(String args[]) {
		New_Class v=new New_Class();
		v.test(3,4);
		
	}
}

