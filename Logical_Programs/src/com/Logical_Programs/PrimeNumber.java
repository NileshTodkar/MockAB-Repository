package com.Logical_Programs;

public class PrimeNumber {
	public static void main(String args []) {
		int Reminder;
		int temp=0;
		for(int i=3;i<=100;i++) {
			for(int j=2;j<i;j++) {
				Reminder=i%j;
				if(Reminder==0) {
					temp=temp+1;
					}
			}
				if(temp==0) {
					System.out.println(i);
				}
				else {
					temp=0;
	
				}
				
			}
	}

}
