/*
#code
public class Main { 
    public static void main() { 
        System.out.println("Hello, World!"); 
    } 
} 


#Error:  can't find main(String[]) method in class: Main


#Explaination : If main has any other signature than this 
			public static void main(String[] args), the JVM 			cannot find it and throws an error.


#Fixing Error : add String args[] (Declare args as an array of string)	
			String[] args and above will run the same way
		-The String[] args in the main method is needed for Java 		programs to accept command-line arguments when executed.

*/
public class Ass2_4{ 
    public static void main(String args[]) { 
        System.out.println("Hello, World!"); 
    } 
} 