/*
#Code=
public class IncorrectWhileLoopControl { 
    public static void main(String[] args) { 
        int num = 10; 
        while (num = 10) { 
            System.out.println(num); 
            num--; 
        } 
    } 
} 
#Error= incompatible types: int cannot be converted to boolean
        while (num = 10) {
                   ^

#Explaination=can only assign an boolean conodtion 


#Fixing error=
*/
class IncorrectWhileLoopControl { 
    public static void main(String[] args) { 
        int num = 10; 
        while (num > 0) { 
            System.out.println(num); 
            num--; 
        } 
    } 
} 