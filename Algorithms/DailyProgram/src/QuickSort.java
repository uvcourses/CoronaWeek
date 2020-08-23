
public class QuickSort { 
	
	public void Sorting(int arr[]) { 
		
		
		for(int i=0;i<arr.length;i++) { 
			for(int j=0;j<arr.length;j++) { 
				 if(arr[i] > arr[j]) { 
					 int temp=arr[i]; 
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			}
		}
	}

	public static void main(String[] args) {
      
		QuickSort q=new QuickSort();
		q.Sorting(new int[] {50,30,40,20,10});
		
	}

}
