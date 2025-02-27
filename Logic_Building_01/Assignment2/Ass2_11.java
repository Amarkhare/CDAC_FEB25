/*
#Code=
Snippet 11:  
public class Main { 
    public static void main(String[] args) { 
        int[] arr = {1, 2, 3}; 
        System.out.println(arr[5]); 
    } 
} 
#Error=
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3

#Explaination= The array has only 3 elements, and we are trying to access 
		5th index which does not exist.


#Fixing error=Can change the size of array or change the accessing index within limit
*/

public class Ass2_11{ 
    public static void main(String[] args) { 
        int[] arr = {1, 2, 3, 5, 6, 7}; 
        System.out.println(arr[5]); 
    } 
} 