/*
22. Write a program to print the following pattern: 
********* 
******* 
***** 
*** 
* 
*** 
***** 
******* 
********* 

no of rows  8
star decrementing 2n-1 upto 5 row and incrementing 2n+1 till 8th row

*/

class Star_22{
	public static void main(String args[]){
		int m = 5;
		for(int i=5; i>=1; i--){
			for(int j=1; j<=2*i-1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int k=2; k<=5; k++){
			for(int l=1; l<=2*k-1; l++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}