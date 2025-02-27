/*
#Code=
public class Main { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = a ** b; 
        System.out.println(result); 
    } 
} 

#Error=illegal start of expression
        int result = a ** b;
                        ^

#Explaination=


#Fixing error=
*/

public class Main { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = a * b; 
        System.out.println(result); 
    } 
} 
