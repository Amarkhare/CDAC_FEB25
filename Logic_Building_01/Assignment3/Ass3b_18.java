/*18. Write a program to print the following pattern: 
    * 
   *** 
  ***** 
 ******* 
  ***** 
   *** 
    * 



*/

class FullPyramid{
	public static void main(String args[]){
		// 5 rows with decrementing spaces from 4 to 0 
		// 5 col with no of stars 2n-1
		// viceversa of above
		int n = 5;
		for(int i = 1; i<=n; i++){
			for(int j = 1; j<=n-i; j++){
				System.out.print(" ");
			}
			for(int k = 1; k<=2*i-1; k++){
				System.out.print("*");
			}
			System.out.println();	
		}
		for(int i = n; i>=1; i--){
			for(int j = 1; j<=n-i; j++){
				System.out.print(" ");
			}
			for(int k = 1; k<=2*i-1; k++){
				System.out.print("*");
			}
			System.out.println();	
		}
	}

}