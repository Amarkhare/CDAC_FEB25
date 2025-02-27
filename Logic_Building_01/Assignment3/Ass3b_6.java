/*6. Write a program to find and print the first 5 prime numbers. 
# Property - one of the factor of non-prime no will definetly be less than or equal of sqrt(N)
o/p -2 3 5 7 11

*/

class Prime{
	public static void main(String args[]){
		int num = 2;
		int count = 0;	
		
		while(count<5){
			boolean isprime = true;
			for(int i=2; i<= (int) Math.sqrt(num); i++){	
				if(num%i == 0){
					 isprime=false; break;
				}
				
			}
			if(isprime){
				System.out.print(num+" ");
				count++; 
			}
			num++;
		}
	}

}