/*Algo - Arithmetic Operations
1.start
2.Declare 7 var and initialize 2
3.do calcluation and store the values in respected var
4.show the o/p
5.end
*/

import java.util.Scanner;
class AO{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a, b, add, mul, sub, div, rem;
		System.out.println("Input 1st no : ");
		a = sc.nextInt();
		System.out.println("Input 2nd no : ");
		b = sc.nextInt();
		
		add = a + b;
		mul = a*b;
		sub = a-b;
		div = a/b;
		rem = a%b;
		
		System.out.println(a+" + "+b+" = "+add);
		System.out.println(a+" - "+b+" = "+sub);
		System.out.println(a+" * "+b+" = "+mul);
		System.out.println(a+" / "+b+" = "+div);
		System.out.println(a+" mod "+b+" = "+rem);
		
	}
	
}