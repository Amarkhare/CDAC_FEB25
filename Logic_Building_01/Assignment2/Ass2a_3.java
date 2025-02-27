/*
Question 3: Calculator  
Write a program that acts as a simple calculator. It should accept two numbers and an operator (+, -, *, /) as input. Use a switch statement to perform the appropriate operation. Use nested if else to check if division by zero is attempted and display an error message.

*/
import java.util.Scanner;
class Calculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a, b;
		char o;
		double result ;
		System.out.println("Enter 1st no :");	
		a = sc.nextInt();
		System.out.println("Enter 2nd no :");
		b = sc.nextInt();
		System.out.println("Enter operator");
		o = sc.next().charAt(0);
		
		if(b==0){System.out.println("Denominator should be non zero value");}
		else if(o == '+'){
			result = a+b; System.out.println("Addition :"+ result);
			}
		else if(o == '-'){
			result = a-b; System.out.println("Substraction :"+result);
			}
		else if(o == '/'){
			result = a/b; System.out.println("Division :"+result);
			}
		else if(o == '*'){
			result = a*b; System.out.println("Multiplication :"+result);
			}

		
		
		
	}
	
}