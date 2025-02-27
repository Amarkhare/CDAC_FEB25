class ConditionalLoopOutput { 
    public static void main(String[] args) { 
        int num = 1; 
        for (int i = 1; i <= 4; i++) { 
            if (i % 2 == 0) { 
                num += i; 
            } else { 
                num -= i; 
            } 
        } 
        System.out.println(num); 
    } 
} 
/*
Dry Run
num = 1
i = 1	> i % 2 != 0
		num = num - i = 1 - 1 = 0
i = 2	> i % 2 == 0
		num = num + i = 0 + 2 = 2
i = 3	> i % 2 != 0
		num = num - i = 2 - 3 = -1
i = 4	> i % 2 == 0
		num = num + i =-1 + 4 = 3
end of loop
	
o/p = 3
*/