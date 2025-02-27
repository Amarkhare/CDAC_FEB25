/*Algo - max of 3
1.Start 
2.Take 3 var(a,b,c) and define it by taking input
3.Compare a&b if a is > then compare a with c and print largest bet them
	    else b is > then compare b with c and print largest bet them
4.print op
5.end

*/

import java.util.Scanner;
class Max3{
	public static void main(String args[]){
	int n1, n2, n3;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Input 1st no : ");
	n1 = sc.nextInt();
	System.out.println("Input 2nd no : ");
	n2 = sc.nextInt();
	System.out.println("Input 3rd no : ");
	n3 = sc.nextInt();

	if(n1>=n2){
		if(n1>=n3){System.out.println("The largest number is :"+n1 );}		else{System.out.println("The largest number is :"+n3 );}
		}
	else if(n2>=n3){System.out.println("The largest number is :"+n2 );}
		else{System.out.println("The largest number is :"+n3 );}
		
	
	}
}