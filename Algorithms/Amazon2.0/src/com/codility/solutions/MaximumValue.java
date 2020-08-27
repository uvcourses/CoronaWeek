package com.codility.solutions;
public class MaximumValue {
	static int MaximumPossible(int num)
    {
        // digit to insert in given number
        int digit = 5;
        // edge case
        if (num == 0)
        {
            return digit * 10;
        }
        // -1 if num is negative number else 1
        int negative = num / Math.abs(num);
        // get the absolute value of given number
        num = Math.abs(num);
        int n = num;
        // maximum number obtained after inserting digit.
        int maxVal = Integer.MIN_VALUE;
        int counter = 0;
        int position = 1;
        // count the number of digits in the given number.
        while (n > 0)
        {
            counter++;
            n = n / 10;
        }
        // loop to place digit at every possible position in the number,
        // and check the obtained value.
        for (int i = 0; i <= counter; i++)
        {
            int newVal = ((num / position) * (position * 10)) + (digit * position) + (num % position);

            // if new value is greater the maxVal
            if (newVal * negative > maxVal)
            {
                maxVal = newVal * negative;
            }
            position = position * 10;
        }
        return maxVal;
    }
	public static void main(String[] args) {
        
		MaximumValue m=new MaximumValue(); 
		
		System.out.println("Maximum : "+MaximumPossible(276));
		System.out.println("Maximum : "+MaximumPossible(-99999999));
		System.out.println("Maximum : "+MaximumPossible(0));
		System.out.println("Maximum : "+MaximumPossible(860));
		System.out.println("Maximum : "+MaximumPossible(2147483647));
	
	}
}
