/*Algo celsius to fahrenheit
1. Start 
2. Declare 2 var f and c 
3. initialize c
4. Calculate f
5. print op
6. end

*/
import java.util.Scanner;
class CTF{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	int c;
	float fa;
	System.out.println("Enter temp in celsius: ");
	c = sc.nextInt();
	fa = (c * 9/5)+32;
	System.out.println( c+ "°C is equal to " + fa+ "°F");
	
	}
	

}