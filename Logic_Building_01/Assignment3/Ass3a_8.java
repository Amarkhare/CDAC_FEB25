class LoopIncrement { 
    public static void main(String[] args) { 
        int count = 0; 
        for (int i = 0; i < 4; i++) { 
            count += i++ - ++i; 
        } 
        System.out.println(count); 
    } 
 
 
} 
/*
Dry run -
count = 0
>	i = 0
	count = 0 + 0 - 2 = -2
		    |
		    1
>	i = 2
	count = -2 + 2 - 4 = -4
		     |
	             3
>	i = 4 end of loop
o/p = -4

*/