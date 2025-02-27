/*20. Write a program to print the following pattern: 
5 
5*4 
5*4*3 
5*4*3*2 
5*4*3*2*1

- 5 rows 5 columns increasing elements w.r.t row


*/
class FivePatt{
	public static void main(String args[]){
		int n = 5;
		for(int i=n; i>=1; i--){
			System.out.print(n);
			for(int j=4; j>=i; j--){
				System.out.print("*");
				System.out.print(j);
			}
			System.out.println();
		}
	}	

}