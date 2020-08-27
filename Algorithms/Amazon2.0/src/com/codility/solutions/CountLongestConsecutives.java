package com.codility.solutions;

public class CountLongestConsecutives {
	static int CountLongestConsecutives(int[] arr) {
		int i, maxLen = 0;

		int curr = arr[0];
		i = 1;

		for (int k = 1; k < arr.length; k++) {
			curr++;
			if (arr[k] == curr) {
				i++;
				// if k is the last index of the array and still it is matching.
				if (k == arr.length - 1) {
					if (i > maxLen)
						maxLen = i;
				}
			} else {
				if (i > maxLen)
					maxLen = i;

				if (arr.length - k - 1 < maxLen) {
					// remaining array size is already smaller from the maxLen found.
					// No need to traverse then.
					break;
				} else {
					curr = arr[k];
					i = 1;
				}
			}
		}
		return maxLen;
	}

	public static void main(String[] args) {

		 int[] arr = { -2, -3, -4, -5,-6,-7, -8, 9, 10 };
		 
		/* int[] arr = new int[1000]; 
		 
		 for(int i=0;i<500;i++) { 
			 arr[i]=0;
		 }
		 for(int j=501;j<1000;j++) { 
			 arr[j]=j;
		 } */
		 
		int count = CountLongestConsecutives(arr); 
         
         System.out.println(count);
	}

}
