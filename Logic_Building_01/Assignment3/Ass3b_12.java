/*12. Write a program to draw the following pattern: 
***** 
***** 
***** 
***** 
***** 
o/p = 

D:\CDAC\1_logic_building\Assignments>javac Ass3b_12.java

D:\CDAC\1_logic_building\Assignments>java Rect
*****
*****
*****
*****
*****



*/
class Rect{
	public static void main(String args[]){
		//5 rows, 5 col withouth space

		for(int i = 1; i<=5; i++){
			for(int j = 1; j<=5; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}