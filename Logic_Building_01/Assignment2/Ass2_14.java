/*
#Code=
public class Main { 
    public static void main(String[] args) { 
        double num = "Hello"; 
        System.out.println(num); 
    } 
} 


#Error= incompatible types: String cannot be converted to double

#Explaination= Typecasting works only between compatible types (e.g., int to double, float to double).


#Fixing error= change the data type from double to String
*/
public class Ass2_14{ 
    public static void main(String[] args) { 
        String num = "Hello"; 
        System.out.println(num); 
    } 
} 