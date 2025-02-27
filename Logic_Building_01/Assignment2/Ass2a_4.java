/*
Question 4: Discount Calculation  
Write a program to calculate the discount based on the total purchase amount. Use the following 
criteria: 
 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount. 
 If the total purchase is between Rs.500 and Rs.999, apply a 10% discount. 
 If the total purchase is less than Rs.500, apply a 5% discount. 
Additionally, if the user has a membership card, increase the discount by 5%
*/
import java.util.Scanner;
class Discount{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total purchase amt: ");
		double amt = sc.nextDouble();
		System.out.println("Do you have the membership card:(true/false)");
		boolean a = sc.nextBoolean();
		double d = 0;

		if(amt>=1000){
			d= (20/100.0)*amt; // taken 100.0 because 20/100 will give int 
					// value zero
			
		}
		else if(amt>=500 && amt<=999){
			d = (10/100.0)*amt;
			
		}
		else if(amt<500){
			d = (5/100.0)*amt;
			
		}
		
		if(a == true){ d += (5/100.0)*amt;
				
		}

		double finalPrice = amt - d;

       		 // Displaying results
        	System.out.println("Total Discount: Rs." + d);
        	System.out.println("Final Price to Pay: Rs." + finalPrice);

		
	}

}