/*Algo
1.start
2.Declare 3 variables and Initialize 2 variables
3.Initialize muliplication of initialized 2 var
4.op
5.end
*/
import java.util.Scanner;
class Mul{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//creating a Scanner object in Java that allows us to take 
		//user input from the keyboard.
		System.out.println("Input First No:");
		int a = sc.nextInt();
		System.out.println("Input Second No:");
		int b = sc.nextInt();
		int c = a*b;
		
		System.out.println(a+" x "+b+" = "+c);
		
	}
}