class NestedLoopOutput { 
    public static void main(String[] args) { 
        for (int i = 1; i <= 3; i++) { 
            for (int j = 1; j <= 2; j++) { 
                System.out.print(i + " " + j + " "); 
            } 
            System.out.println(); 
 
 
        } 
    } 
} 

/*
Dry Run =
i = 1 	j = 1
		> 1 1
	j = 2
		> 1 2

i = 2	j = 1
		> 2 1 
	j = 2
		> 2 2

i = 3	j = 1
		> 3 1
	j = 2
		> 3 2
*/	