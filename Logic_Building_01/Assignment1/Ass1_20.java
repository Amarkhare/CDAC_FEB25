/*Algo no of digit
1. Start
2. Declare 2 in n and count
3. n/10;
4. ++count 
5. repeat 3 and 4 until n == 0

*/
import java.util.Scanner;
class Digit{
	public static void main(String args[]){	
		Scanner sc = new Scanner(System.in);
		int a, n, count=0;
		n = sc.nextInt();
		a = n;
		while(n>0){
			n/=10;
			++count;
		}	
		System.out.println("The number "+a+" has "+count+" digits");
	}

}