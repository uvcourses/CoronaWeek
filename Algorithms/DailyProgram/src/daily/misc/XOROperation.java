package daily.misc;

public class XOROperation {

	 void printRepeating(int arr[], int size) 
	    { 
	        int i;   
	        System.out.println("The repeating elements are : "); 
	     
	        for (i = 0; i < size; i++) 
	        { 
	      //  	System.out.println(arr[ Math.abs(arr[i])]);
	            if (arr[ Math.abs(arr[i])] >= 0) 
	                arr[ Math.abs(arr[i])] = -arr[ Math.abs(arr[i])]; 
	            else
	                System.out.print(Math.abs(arr[i]) + " "); 
	        }          
	    }  
	  
	    // Driver program  
	    public static void main(String[] args)  
	    { 
	    	XOROperation duplicate = new XOROperation(); 
	        int arr[] = {1, 2, 3, 1, 3, 100, 100}; 
	        int arr_size = arr.length; 
	  
	        duplicate.printRepeating(arr, arr_size); 
	    } 
}
