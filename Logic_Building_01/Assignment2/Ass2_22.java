/*
#Code=
public class Main { 
    public static void main(String[] args) { 
        static void displayMessage() { 
            System.out.println("Message"); 
        } 
    } 
} 

#Error= illegal start of expression
        static void displayMessage() {
        ^
Ass2_22.java:24: error: class, interface, or enum expected
}
^
2 errors

#Explaination=method inside method is not allowed


#Fixing error=define the method seprately
*/
public class Ass2_22{ 
    public static void main(String[] args) {  
	Ass2_22 obj = new Ass2_22(); //Creating obj
	obj.displayMessage(); //using method
        } 
	static void displayMessage(){ 
            System.out.println("Message");
    } 
} 
