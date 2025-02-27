/*
11. Write a Java program to demonstrate the use of both pre-increment and post-decrement 
operators in a single expression 
o/p 11 + 11 = 22
	  |
	  12


*/

class PP{
	public static void main(String args[]){
		int a = 10;
		int b = ++a   + a++;
			//pre  /post
		System.out.println(b);
	}
}