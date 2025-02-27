/*
#code
public class Main { 
    public static void main(String[] args) { 
        int x = y + 10; 
        System.out.println(x); 
    } 
} 

#Error1 :  cannot find symbol
        int x = y + 10;
                ^
  symbol:   variable y



#Explaination: Variable should be declare, because the java compiler allocates memory based on its type and Should be initialized before it is used.


#Fixing Error

*/

public class Ass2_6{ 
    public static void main(String[] args) {
	int y=10; 
        int x = y + 10; 
        System.out.println(x); 
    } 
} 