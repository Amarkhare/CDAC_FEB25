/*19. Write a program to print the following pattern: 
1 
1*2 
1*2*3 
1*2*3*4 
1*2*3*4*5


*/

//no of rows = 5
//in rows print * with col no iteration -1 less than col no

class NoStr{
	public static void main(String args[]){
		int n = 5;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=1; j++){
				System.out.print(j);
			}
			for(int k=2; k<=i; k++){
				System.out.print("*");
				System.out.print(k);
			}
			System.out.println();
		}
	}
}