/*
#Code=
public class IncorrectWhileCondition { 
    public static void main(String[] args) { 
        int count = 5; 
        while (count = 0) { 
            System.out.println(count); 
            count--; 
        } 
    } 
} 
// E
#Error= while condtion

#Explaination= having an = operator instead of an boolean condition


#Fixing error=
*/
class IncorrectWhileCondition{ 
    public static void main(String[] args) { 
        int count = 5; 
        while(count > 0){ 
            System.out.println(count); 
            count--; 
        } 
    } 
} 
