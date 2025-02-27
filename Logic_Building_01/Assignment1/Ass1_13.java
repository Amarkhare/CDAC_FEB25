/*Algo = Avg of 3 
1. Start
2. Declare and initialize 3 var
3. Declar Avg var 
4. Calculate avg
5. show op
6. end
*/
import java.util.Scanner;
class Avg{

	public static void main(String args[]){
	int a, b, c;
	Scanner sc = new Scanner(System.in);
	System.out.println("Input 1st no:");
	a = sc.nextInt();
	System.out.println("Input 2nd no:");
	b = sc.nextInt();	
	System.out.println("Input 3rd no:");	
	c = sc.nextInt();
	
	float avg;
	avg = (a+b+c)/3;
	
	System.out.println("The avg is :"+ avg);
	}

}