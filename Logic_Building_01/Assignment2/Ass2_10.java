/*
#Code=
public class Main { 
    public void display() { 
        System.out.println("No parameters"); 
    } 
    public void display(int num) { 
        System.out.println("With parameter: " + num); 
    } 
    public static void main(String[] args) { 
        display(); 
        display(5); 
    } 
}
#Error1 =error: non-static method display() cannot be referenced from a static context
        display();
        ^
Ass2_10.java:32: error: non-static method display(int) cannot be referenced from a static context
        display(5);
        ^
2 errors

#Explaination= java does not allow calling non-static methods inside static
		methods withouth an obj

#What happens when you compile and run this code? Is method overloading allowed? - yes the method overloading is allowed after resolving error.
	-Method Overloading means defining multiple methods with the same 	name but with different parameters (number, type, or both) within 	the same class.

#Fixing error= We 1st have to create an obj call non-static method inside static methods
*/
public class Ass2_10{ 
    public void display() { 
        System.out.println("No parameters"); 
    } 
    public void display(int num) { 
        System.out.println("With parameter: " + num); 
    } 
    public static void main(String[] args) {
	Ass2_10 obj = new Ass2_10(); 
        obj.display(); 
        obj.display(5); 
    } 
}