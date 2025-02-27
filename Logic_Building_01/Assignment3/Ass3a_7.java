class NestedIncrement { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = ++a * b-- - --a + b++; 
        System.out.println(result); 
    } 
} 

/*
Dry run -
a = 10, b = 5
result = 11 * 5 - 10 + 4 = 49
	      |		|
	      4		5


*/