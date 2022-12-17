package com.GetAndSet;

public class LogicalPractice {
	public static void main(String args []) {
		int temp=0;
		System.out.print("Prime Numbers= ");
		
		for(int a=3;a<=50;a++) {
			for(int b=2;b<a;b++) {
				if(a%b==0) {
					temp=temp+1;
				}
			}
			if(temp==0) {
				System.out.print(a+", ");
			}else{
				temp=0;
			}
		}
		
	}
}
		
	


