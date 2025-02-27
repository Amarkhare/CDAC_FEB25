/*
1. Start
2. Declare and initialize no(a)
3. Take the Sqrt of a no and store it in another var (b)
4. if a/b == 0 -> not prime 
5. 	b--;

6. else repeat 4 and 5 till b ==2


*/
import java.util.Scanner;
class Prime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = (int)Math.sqrt(a);
		for(int i = 2; i<=b; i++){
			if(a%i == 0){System.out.println("Not Prime");
				break;
                                }	    
			else if(i==b){System.out.println("Prime");
				}
			
		} 
		if(a>1){
			if(b<2){System.out.println("Prime");}
		}
		
	}

}