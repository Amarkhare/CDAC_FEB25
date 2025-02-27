/*
Question 5: Student Pass/Fail Status with Nested Switch 
Write a program that determines whether a student passes or fails based on their grades in three 
subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or 
more subjects, print the number of subjects they failed in. 
*/
import java.util.Scanner;
class Result{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int s1, s2, s3, count=0;
		System.out.println("Enter the 3 sub marks resp : ");
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		s3 = sc.nextInt();
		
		if(s1>=40){count++;}
		if(s2>=40){count++;}
		if(s3>=40){count++;}
		
		switch(count){
			case 1: case 2: case 0:
			switch(count){
				case 0 : System.out.println("Fail in 3 subject"); break;
				case 1 : System.out.println("Fail in 2 subject"); break;
				case 2 : System.out.println("Fail in 1 subject"); break;
			}
			break;
			case 3: System.out.println("Pass"); break;
		}	
		
		
	}

}	