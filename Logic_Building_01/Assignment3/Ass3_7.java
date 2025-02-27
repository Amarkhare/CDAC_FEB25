/*
#Code=
public class UninitializedWhileLoop { 
    public static void main(String[] args) { 
        int count; 
 
 
        while (count < 10) { 
            System.out.println(count); 
            count++; 
        } 
    } 
}
#Error=variable count might not have been initialized
        while (count < 10) {
               ^

#Explaination=local variable (var that are declared inside method) did not get initialized to default value


#Fixing error=
*/
class UninitializedWhileLoop { 
    public static void main(String[] args) { 
        int count=0; 
 
 
        while (count < 10) { 
            System.out.println(count); 
            count++; 
        } 
    } 
}