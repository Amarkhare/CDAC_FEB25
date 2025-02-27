/*
#Code=
public class Main { 
    public static void main(String[] args) { 
        int class = 10; 
        System.out.println(class); 
    } 
}
#Error=Ass2_9.java:18: error: not a statement
        int class = 10;
        ^
Ass2_9.java:18: error: ';' expected
        int class = 10;
           ^
Ass2_9.java:18: error: <identifier> expected
        int class = 10;
                 ^
Ass2_9.java:19: error: <identifier> expected
        System.out.println(class);
                          ^
Ass2_9.java:19: error: illegal start of type
        System.out.println(class);
                           ^
Ass2_9.java:19: error: <identifier> expected
        System.out.println(class);
                                ^
Ass2_9.java:21: error: reached end of file while parsing
}
 ^
7 errors


#Explaination= class is a reserved keyword, so java does not 
		allow keywords as an variable name

#Why Can't Reserved Keywords Be Used as Identifiers in Java?
-  they have a predefined meaning 

#Fixing error=changing var name which is not reserved
*/
public class Ass2_9{ 
    public static void main(String[] args) { 
        int cl = 10; 
        System.out.println(cl); 
    } 
}