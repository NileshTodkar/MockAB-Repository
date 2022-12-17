package Com.BasicProgrammingknowlge;

public class printz {
	public static void main(String [] args) {
		
		for(int i=0;i<=7;i++){
			
			for(int j=0;j<=7;j++){
				if (i==j) {
					System.out.print("*");
				}
			}
			
		}
		System.out.println("");
         for(int i=0;i<7;i++) {
			
			for(int j=6;j>=0;j--){
				if (i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
					}
				
			}
			System.out.println("");
			
		}
         for(int i=0;i<=7;i++){
 			
 			for(int j=0;j<=7;j++){
 				if (i==j) {
 					System.out.print("*");
 				}
 			}
 			
 		}
		
		
		
		
	}
}