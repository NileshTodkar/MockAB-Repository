package com.Star_Patterns;

public class Cross_Starpattern {
	public static void main(String args[]) {

	for(int i=1;i<=5;i++) {
		for(int j=1;j<i;j++) {
			System.out.print(" ");
		}
		System.out.print("*");
		for(int k=8;k>=(i*2)-1;k--) {
			System.out.print(" ");
		}
		System.out.println("*");
	}
	for(int i=1;i<=5;i++) {
		for(int k=4;k>=i;k--) {
			System.out.print(" ");
		}
		System.out.print("*");
		for(int j=2;j<=(i*2)-1;j++) {
			if(j>1 && j<i*2) {
				System.out.print(" ");
			}
			
		}
		System.out.println("*");
	}
	}
		
}	