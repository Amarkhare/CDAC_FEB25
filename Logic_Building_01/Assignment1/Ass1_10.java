/*Algo = even odd

1.Start 
2.Declare and define int variable
3.if no is divisible by 2 even else odd
4.show even or odd
5.end
*/
import java.util.Scanner;
class EO{
	public static void main(String args[]){
		int n; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number : ");
		n = sc.nextInt();

		if(n%2 == 0){System.out.println("The number "+n+" is even");}
		else{System.out.println("The number "+n+" is odd");}
	}

}