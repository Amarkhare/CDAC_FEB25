class DoWhileLoop { 
    public static void main(String[] args) { 
        int i = 1; 
        do { 
            System.out.print(i + " "); 
            i++; 
        } while (i < 5); 
        System.out.println(i); 
    } 
} 
/*
DRY RUN-
i = 1
>	sop 1
	i = 1 + 1 = 2
i = 2
>	sop 2
	i = 2 + 1 = 3
i = 3
>	sop 3
	i = 3 + 1 = 4
i = 4
>	sop 4
	i = 4 + 1 = 5
i = 5
>loop end

o/p = 1 2 3 4 5
	


*/