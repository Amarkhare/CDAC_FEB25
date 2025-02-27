/*
#code-
public class Main { 
    static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
} 



#Error1 : class Main is public, should be declared in a file named Main.java
public class Main {
       ^
1 error

#Explaination1 :Public class name should be same as file name

#Error2 :  Main method not found in class Ass2_2, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application

#Explaination2 : Main method is not public so it cannot be accessed by jvm

#Fixing error1 : Making public class name same as file name

#Fixing error2 : Making main method public

*/
public class Ass2_2{ 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
} 