/*Algo - Tables
1.Start
2.Declare and initialize 3 table var
3.while loop until 10 and print values in it
4.end

*/
import java.util.Scanner;
class Tables{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int n;
		int a = 1;
		int mul = 0;
		System.out.println("Input a number: ");
		n = sc.nextInt();
		while(a <=10 ){
		mul = n*a;
		System.out.println(n+" x "+a+" = "+ mul);
		a++;
		}
	}
}