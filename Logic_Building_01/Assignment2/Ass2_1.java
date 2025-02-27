/*
public class Main { 
    public void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
} 

//error1: class Main is public, should be declared in a file named Main.java
public class Main {
       ^
1 error

//Explaination : If the class name is public the file name should be same as class name.

//error2: Main method is not static in class Ass2_1, please define the main method as:
   public static void main(String[] args)

//Explaination - java calls main withouth creating an obj of class
		and non static method requires an instance i.e obj
		so it can not be called unles it is static
*/

//Fixing error1 - Can change class name same as file name or
//		can change file name to same as class nameor
//		can remove class as public.

//Fixing error2- make main class static

public class Ass2_1{ 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
} 