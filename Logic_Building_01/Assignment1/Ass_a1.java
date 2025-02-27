import java.util.Scanner;
class PAN{
	public static void main(String args[]){
		int n;	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no");
		n = sc.nextInt();
		if(n>0){System.out.println(n +" is  positive no");}
		else if(n<0){System.out.println(n +" is  negative no");}
		else{System.out.println(n +" is niether negative nor positive ");}
	}	

}