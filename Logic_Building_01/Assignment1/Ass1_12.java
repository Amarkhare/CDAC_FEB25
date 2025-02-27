/*Algo Reverse no:

1.Start 
2.Take a no.
3.declare a reverse var and initialize as 0
4.Declare remainder var
5.modulo of a no i.e no%10 and store the rem
6.reverse = reverse *10 +rem;
7.update a no by dividing it by 10;
8.repeat the steps from 4 to 7 till updated no become 0;
9.


*/
import java.util.Scanner;
class Rev{
	public static void main(String args[]){
		
		int orignal, updated, rem, rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no:" );
		orignal = sc.nextInt();
		updated = orignal;
		
		while(updated>0){
			rem = updated%10;
			rev = rev * 10 + rem;
			updated /= 10;
		}
		
		System.out.println("The Reverse of "+orignal+" is "+rev);
		
	}

}