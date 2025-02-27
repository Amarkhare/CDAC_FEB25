/*
#Code=
public class Main { 
    public static void main(String[] args) { 
        while (true) { 
            System.out.println("Infinite Loop"); 
        } 
    } 
} 

#Error=Infinite loop

#Explaination= The loop condition is always true


#Fixing error=there should be terminatino condtion
*/
public class Ass2_12{ 
    public static void main(String[] args) { 
	boolean a = true;
        while (a) { 
            System.out.println("Infinite Loop"); 
		a = false;
        } 
    } 
} 