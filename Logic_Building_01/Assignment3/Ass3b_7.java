/*
7. Write a program to calculate the sum of the digits of the number 9876. The output should be 
30 (9 + 8 + 7 + 6). 

*/
class Sum{
	public static void main(String args[]){
		int n = 9876;	
		int s = 0;
		
		int index = (String.valueOf(n).length());
		//converts int to string and calculating length
		int arr[] = new int[index];
		int i = index -1;
		
		while(n > 0){
			int digit = n % 10;
			s += digit ;
			
			arr[i] = digit;
			i--;
			n /= 10;
		}
		
		System.out.print(s+ "( ");
		for(i=0; i<arr.length; i++){
			System.out.print(arr[i]);
			if(i<arr.length-1){
				System.out.print(" + ");
			}
		}
		System.out.print(" )");
	}
}



//OR-----------------------------------------------------------------------

/*
class Sum{
	public static void main(String args[]){
		int n = 9876;
		int s = 0;
		
		//will use string builder class to store the value in sequence
		
		StringBuilder breakdown = new StringBuilder();
		

		while(n > 0){
			int digit = n % 10;
			s += digit ;
			
				//insert method in StringBuilder to add given 
				//string at the given position 
				//syntax insert(position, string)
			breakdown.insert(0, "+" + digit);
			n /=10;
		}
		breakdown.delete(0,1);// delete 1st index string
		//delete(starting index, ending index)// last index is excluded
		
		System.out.println(s + "(" + breakdown +")");
	}
}
*/