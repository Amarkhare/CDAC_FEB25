/*Alg - Fib
1.Start
2. f1 = 0 , f2 = 1 given 
3. f3 = f1 + f2
4. f1 = f2
5. f2 = f3
6. repeat step 3 to 5 till the position you want series


*/

class Fib{
	public static void main(String args[]){

		int n = 10, f1 = 0, f2 = 1, f3;
		System.out.print(f1 +" "+f2);
		while(n-2>0){
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			System.out.print(" "+f3);
			n--;
		}
	}	

}