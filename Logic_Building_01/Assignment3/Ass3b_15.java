
/*15. Write a program to print the following pattern: 
    * 
   ** 
  *** 
 **** 
*****

*/

class OppRight{
	public static void main(String args[]){
		// 5 rows with decrementing spaces from 4 to 0 
		// 5 col with no of stars w.r.t no of row
		int n = 5;
		for(int i = 1; i<=n; i++){
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

    