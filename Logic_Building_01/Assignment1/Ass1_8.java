/*Algo = Swap withouth 3rd var

1.start
2.Declare and initialize 2 var
3.store the sum of both in 1st var i.e a
4.substract sum i.e a - b to get value of a and store it in b
5.substract sum i.e a -b i.e updated value previously a and store it in a

*/
import java.util.Scanner;
class Swap{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Input 1st no");
	int a = sc.nextInt();
	System.out.println("Input 2nd no");
	int b = sc.nextInt();
	
	System.out.println("Before Swapping");
	System.out.println("First no = "+a);
	System.out.println("First no = "+b);
	
	a = a+b;
	b = a-b;
	a = a-b;
	System.out.println("After Swapping");
	System.out.println("First no = "+a);
	System.out.println("First no = "+b);
	}		
}
