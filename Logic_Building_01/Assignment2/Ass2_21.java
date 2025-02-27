/*
#Code=
public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    // Missing closing brace here 
} 
#Error=reached end of file while parsing
}
 ^
1 error

#Explaination=Every Opened brace should be close


#Fixing error=close the brace
*/

public class Ass2_21{ 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    // Missing closing brace here 
	}
} 