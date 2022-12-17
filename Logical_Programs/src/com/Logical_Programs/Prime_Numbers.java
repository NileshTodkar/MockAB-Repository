package com.Logical_Programs;

public class Prime_Numbers {
	
	public static void main(String args []) {

		int reminder;
		boolean isPrime=true;
		for(int i=3;i<=100;i++) {
			for(int j=2;j<i;j++) {
				reminder=i%j;
				if(reminder==0) {
					 isPrime=false;
					 break;
				
					}
			}
				if(isPrime) {
					System.out.println(i);
				}
				else {
					isPrime=true;
	
				}
				}
	}
		}
		
	

