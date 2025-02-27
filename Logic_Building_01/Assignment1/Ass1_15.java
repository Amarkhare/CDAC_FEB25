/*Algo - Factorial;
1.Start 
2. Declare 3 var orignal and updated
3. define orignal value = x and initialize orignal value to updated = y and orignal var.
4. y--;
5. x *= y
6. repeat 4 and 5 till y became 1
7. end;
*/

import java.util.Scanner;
class Fact{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int x , y, orignal;
		System.out.println("Input a no : ");
		x = sc.nextInt();
		y = x;
		orignal = x ;
		while(y>1){
			--y;
			x *= y;
		}
		
		System.out.println("Factorial of "+orignal+" is "+x );
	}

}