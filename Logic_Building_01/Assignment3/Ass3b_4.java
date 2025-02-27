
/*
4. Write a program to reverse the digits of the number 1234. The output should be 4321. 

o/p = 4321

*/
class Rev{
	public static void main(String args[]){
	int num = 1234;
	int rem = 0;
	int rev = 0;
	while(num>0){
		rem = num % 10;
		rev = rev * 10 + rem;
		num /= 10;
	}
	System.out.println(rev);
		
	}

}