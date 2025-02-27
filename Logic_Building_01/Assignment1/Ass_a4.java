
import java.util.Scanner;
class Morning{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the time w.r.t 24hr");
		int t = sc.nextInt();
		if(5<t<12){System.out.println("Good Morning !");}
	}

}