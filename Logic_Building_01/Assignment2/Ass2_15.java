/*
#Code=
public class Main { 
    public static void main(String[] args) { 
        int num1 = 10; 
        double num2 = 5.5; 
        int result = num1 + num2; 
        System.out.println(result); 
    } 
} 

#Error= incompatible types: possible lossy conversion from double to int

#Explaination=The is a loss of after decimal value in the result variable
		as its data type was int.


#Fixing error=converting int data type to double of result.
		Java automatically converts smaller data types to larger ones 		(Implicit conversion or typecasting)to avoid data loss.
*/
public class Ass2_15{ 
    public static void main(String[] args) { 
        int num1 = 10; 
        double num2 = 5.5; 
        double result = num1 + num2; 
        System.out.println(result); 
    } 
} 
