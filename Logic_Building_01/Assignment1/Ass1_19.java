/*Algo power of no;

1. Start 
2. Declare 2 no b and e and initialize it 
3. b *= b
4. e-- 
5. repeat 3 and 4 until e == 0

*/
import java.util.Scanner;
class Power{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int result=1, b, e;	
		System.out.println("Input base number: ");
		b = sc.nextInt();

		System.out.println("Input exponent number: ");
		e = sc.nextInt();
		for(int i=1; i<=e; i++){
			result *=b;
			
		}
		System.out.println(b +" raised to power "+ e +" is "+ result);
	}

}