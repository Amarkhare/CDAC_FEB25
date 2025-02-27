/*17. Write a program to print the following pattern: 
***** 
 **** 
  *** 
   ** 
    * 



*/

class InvertedRight{
	public static void main(String args[]){
		// 5 rows with Incrementing spaces from 0 to 4 
		// 5 col with no of stars decrementing from 5 to 1
		int n = 5;
		for(int i = 5; i>=1; i--){
			for(int j = 1; j<=n-i; j++){
				System.out.print(" ");
			}
			for(int k = 1; k<=i; k++){
				System.out.print("*");
			}
			System.out.println();	
		}
	}

}

    