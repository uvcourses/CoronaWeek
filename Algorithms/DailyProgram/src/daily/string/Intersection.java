package daily.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {

	public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {List<Integer> result = new ArrayList<Integer>();
    
    for (int i=0; i<arr1.length; i++) {
        int k = arr1[i];
        if (Arrays.binarySearch(arr2, k) >= 0 && Arrays.binarySearch(arr3, k) >= 0) result.add(k);
    }
    
    return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intersection in=new Intersection(); 
		int a1[] = {1,2,3,4,5};
		int a2[] = {1,2,5,7,9};
		int a3[] = {1,3,4,5,8};
		
		in.arraysIntersection(a1, a2, a3); 
	}

}
