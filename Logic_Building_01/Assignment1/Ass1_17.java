/*Algo Natural no;
1. Start 
2. take input from user in var n
3. declare var a = 1
4. print a
5. n--
6. a++
7. Repeat till n == 0

*/

import java.util.Scanner;
class Nat{
	public static void main(String args[]){	
		int n, a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		n = sc.nextInt();
		a = 1;
		while(n>0){
			System.out.print(a+ " ");
			a++;
			n--;
		}
	}

}