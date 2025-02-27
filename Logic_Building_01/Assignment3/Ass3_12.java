/*
#Code=
public class LoopVariableScope { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) { 
            int x = i * 2; 
        } 
        System.out.println(x); // Error: 'x' is not accessible here 
    } 
} 
// Error to investigate: Why does the variable 'x' cause a compilation error? 

#Error= 'x' is not accessible here
                           ^
  symbol:   variable x
  location: class LoopVariableScope
1 error

#Explaination= var x is limited to the scope of for loop only
	


#Fixing error=We have to declare var x at main method level and have to initialize it becaue it is at method so no default value will assign
*/
class LoopVariableScope { 
	
    public static void main(String[] args) { 
	int x=0;
        for (int i = 0; i < 5; i++) { 
            x = i * 2; 
        } 
        System.out.println(x); // Error: 'x' is not accessible here 
    } 
} 
