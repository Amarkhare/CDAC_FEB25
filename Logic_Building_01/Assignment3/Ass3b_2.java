//2. Write a program to compute the factorial of the number 10. 

class Fact{	
	public static void main(String[] args){
		int f = 1;
		for(int i = 1; i<=10; i++){
			f = f*i;  
		}
		System.out.println(f);
	}
}
//o/p = 3628800
