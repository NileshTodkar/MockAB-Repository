package com.Star_Patterns;

public class Right_Arrow_StarPattern {
public static void main(String args[]) {
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i+4;j++) {
				 System.out.print(" ");
				}
		 System.out.println("*");
			
		
			}
        for(int i=4;i>=1;i--) {
			
			for(int j=1;j<=i+4;j++) {
				 System.out.print(" ");
				}
		 System.out.println("*");
			
		
			}
		}

}
