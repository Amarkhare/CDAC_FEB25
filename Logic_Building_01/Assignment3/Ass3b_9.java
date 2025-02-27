/*
9. Write a program to find and print the largest digit in the number 4825.

op = largest no : 8


*/

class LargestNo{
	public static void main(String args[]){
		int ln = 4825;
		int largest = 0;
		int rem = 0;

		while(ln>0){
			rem = ln%10;
			if(largest<rem){	
				largest = rem;
			}
			ln = ln/10;
		}
		System.out.println("largest no : "+largest);
	

	}

}