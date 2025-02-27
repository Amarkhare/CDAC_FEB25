
import java.util.Scanner;
class AreaRectangle{	
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int l, b, a;
		System.out.println("Enter length");
		l = sc.nextInt();
		System.out.println("Enter breadth");
		b = sc.nextInt();
		a = l*b;
		System.out.println("Area of rectangle : "+a);
	}

}