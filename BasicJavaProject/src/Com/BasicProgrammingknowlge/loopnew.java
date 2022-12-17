package Com.BasicProgrammingknowlge;

public class loopnew {
	
	static int j;
	static int k;
	static int l;
	public  void methodone() {
	
	        for (int i=1;i<=10080;i++) {
	        	l=i;
	        	j=i/60;
	        	k=j/24;
		      switch (i) {
			case 1440: System.out.println(k+ "day"+"="+ j+ "Hrs"+"="+i+ "min");break;
			case 2880:System.out.println(k+ "day"+"="+ j+ "Hrs"+"="+i+ "min");break;
			case 4320: System.out.println(k+ "day"+"="+ j+ "Hrs"+"="+i+ "min");break;
			case 5760: System.out.println(k+ "day"+"="+ j+ "Hrs"+"="+i+ "min");break;
			case 7200: System.out.println(k+ "day"+"="+ j+ "Hrs"+"="+i+ "min");break;
			case 8640:System.out.println(k+ "day"+"="+ j+ "Hrs"+"="+i+ "min");break;
			case 10080: System.out.println(k+ "day"+"="+ j+ "Hrs"+"="+i+ "min");break;
			}
	        
	        }
	        System.out.println("1week="+k+ "day"+"="+ j+ "Hrs"+"="+l+ "min");  
	}
	       
	
}


