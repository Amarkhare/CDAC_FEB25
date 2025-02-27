class DecrementingLoop { 
    public static void main(String[] args) { 
        int total = 0; 
        for (int i = 5; i > 0; i--) { 
            total += i; 
            if (i == 3) continue; 
            total -= 1; 
        } 
        System.out.println(total); 
    } 
} 
/*Dry Run -

The continue statement in Java is used to skip the current iteration of a loop and move directly to the next iteration.

total = 0
i = 5
	total = 0 + 5 = 5; 
	total = 5 - 1 = 4;
i = 4
	total = 4 + 4 = 8
	total = 8 - 1 = 7
i = 3 
	total = 7 + 3 = 10
	//Due to continue statement it jump to next iteration
i = 2 
	total = 10 + 2 = 12
	total = 12 - 1 = 11
i = 1
	total = 11 + 1 = 12
	total = 12 - 1 = 11
o/p = 11
	


*/