/*
#Code=
public class OffByOneDoWhileLoop { 
    public static void main(String[] args) { 
        int num = 1; 
        do { 
            System.out.println(num); 
            num--; 
        } while (num > 0); 
    } 
} 
#Error=

#Explaination=

? What adjustments are needed to print the 
numbers from 1 to 5?
- num-- to num ++
- num>0 to num <5

#Fixing error=
*/
class OffByOneDoWhileLoop { 
    public static void main(String[] args) { 
        int num = 1; 
        do { 
            System.out.println(num); 
            num++; 
        } while (num < 6); 
    } 
} 