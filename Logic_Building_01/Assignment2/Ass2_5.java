/*
#code
public class Main { 
    public static void main(String[] args) { 
        System.out.println("Main method with String[] args"); 
    } 
    public static void main(int[] args) { 
        System.out.println("Overloaded main method with int[] args"); 
    } 
} 

#Error1 :public class name 


#Explaination :  file and class name should same


#Fixing Error : match the file and class name

#  We can have multiple main method but JVM only calls main(String[] args), so overloaded main(int x) must be called manually. 

*/
public class Ass2_5{ 
    public static void main(String[] args) { 
        System.out.println("Main method with String[] args"); 
    } 
    public static void main(int[] args) { 
        System.out.println("Overloaded main method with int[] args"); 
    } 
} 