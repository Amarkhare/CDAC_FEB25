/*
#Code=
public class Main { 
    public static void main(String[] args) { 
        String str = null; 
        System.out.println(str.length()); 
    } 
} 
#Error=java.lang.NullPointerException

#Explaination=Var str has not been initialized


#Fixing error=should be initialized 1st
*/
public class Ass2_13{ 
    public static void main(String[] args) { 
        String str = "1"; 
        System.out.println(str.length()); 
    } 
} 