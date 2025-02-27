/*Algorithm - Area of circle
1.Start
2.Declare and initialize variable for radius
3.Calculate area using formula 
4.Show the output
5.End

*/
//import java.lang.Math.*; 
import java.util.Scanner;

class Area{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius of circle");
		int radius = sc.nextInt();
		Double Area;
		Area = radius*radius*Math.PI;
		
		System.out.println("Area of the Circle is :" + Area);
	}
}