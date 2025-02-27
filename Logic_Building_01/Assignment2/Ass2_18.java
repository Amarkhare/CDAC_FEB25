/*
#Code=
public class Main { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = a + b * 2; 
        System.out.println(result); 
    } 
} 
#Error=no error

#Explaination=


#Fixing error=

#Due to operator precedence mutliplication will be perform 1st then addition
*/
public class Ass2_18{ 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = a + b * 2; 
        System.out.println(result); 
    } 
} //o/p = 20