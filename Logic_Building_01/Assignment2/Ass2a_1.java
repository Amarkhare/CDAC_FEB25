/*
Question 1: Grade Classification  
Write a program to classify student grades based on the following criteria: 
 If the score is greater than or equal to 90, print "A" 
 If the score is between 80 and 89, print "B" 
 If the score is between 70 and 79, print "C" 
 If the score is between 60 and 69, print "D" 
 If the score is less than 60, print "F" 
*/
import java.util.Scanner;
class Grade{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the Score" );
		int score = sc.nextInt();
		if(score>=90){System.out.println("A");}
		if(80<=score && score<=89){System.out.println("B");}
		if(70<=score && score<=79){System.out.println("C");}
		if(60<=score && score<=69){System.out.println("D");}
		if(score<60){System.out.println("F");}
	}
	
}