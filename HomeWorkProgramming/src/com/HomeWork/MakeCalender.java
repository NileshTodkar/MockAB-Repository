package com.HomeWork;

public class MakeCalender {
	static int j;
	public static void main (String []args) {
		
		for (int i=1;i<=31;i++) {
			if (i>=1 && i<=7) {
			      j=i;	
			   }
			else if (i>=8 &&i<=14) {
				 j=i-7;
				}
           else if (i>=15 &&i<=21) {
	           j=i-14;
	         }
           else if (i>=22 &&i<=28) {
	           j=i-21;
	         }
           else if (i<=29 &&i<=31) {
	           j=i-28;
             }
	
	switch(j) {
	case 1: System.out.println(i+ "-Monday");break;
	case 2: System.out.println(i+ "-Thuesday");break;
	case 3: System.out.println(i+ "-wedensday");break;
	case 4: System.out.println(i+ "-Thrusday");break;
	case 5: System.out.println(i+ "-Friday");break;
	case 6: System.out.println(i+ "-Saturday");break;
	case 7: System.out.println(i+ "-Sunday");break;
	}
	}
		}
		}
		
		
		
	


