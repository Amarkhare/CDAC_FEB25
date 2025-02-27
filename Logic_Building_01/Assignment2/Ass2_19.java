/*
#Code=
public class Main { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 0; 
        int result = a / b; 
        System.out.println(result); 
    } 
} 

#Error=Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Ass2_19.main(Ass2_19.java:23)

#Explaination=in java div by zero is undefined


#Fixing error=replace the denomiator with non zero value or put an condition at the caclulation stage
*/
public class Ass2_19{ 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 4; 
	int result;
	if(b==0){System.out.println("Change the denomiator to non zero value");}
	else{result = a / b; 
        System.out.println(result); 
	}
    } 
} 