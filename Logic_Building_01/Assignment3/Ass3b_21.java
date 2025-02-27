/*21. Write a program to print the following pattern: 
1 
1*3 
1*3*5 
1*3*5*7 
1*3*5*7*9 

// 5 rows 
// 5 col incrementing data in col with +2 i.e upto 2n-1 
*/
class PlusOnePatt{
	public static void main(String args[]){
		int n =5;
		for(int i=1; i<=2*n-1; i+=2){
			System.out.print(1);
			for(int j=3; j<=i; j+=2){
				System.out.print("*");
				System.out.print(j);
			}
			System.out.println();
		}
	}

}

