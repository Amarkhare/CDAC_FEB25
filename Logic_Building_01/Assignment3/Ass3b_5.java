/*
5. Write a program to print the Fibonacci sequence up to the number 21. 

o/p - 0 1 1 2 3 5 8 13 21
*/

class Fib{
	public static void main(String args[]){
		int f1=0, f2=1, f3=0;
		System.out.print(f1+" "+f2+" ");
		for(int i = 0; i<=21; i++){
			
			f3 = f1 + f2;
			if(f3>21){break;}
			f1 = f2;
			f2 = f3;
			System.out.print(f3+" ");
		}
		
	}
}

