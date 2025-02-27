class WhileLoopBreak { 
    public static void main(String[] args) { 
        int count = 0; 
        while (count < 5) { 
            System.out.print(count + " "); 
            count++; 
            if (count == 3) break; 
        } 
        System.out.println(count); 
    } 
} 
/*
Dry Run -
count = 0

>	count = 0
	sop = 0
	count = 0 + 1 = 1
>	count = 1
	sop = 1
	count = 1 + 1 = 2
>	count = 2 
	sop = 2
	count = 2 + 1 = 3
	count == 3 > out of loop

> o/p = 0 1 2 3
	|
	



*/