package daily.string;

public class SubtractProduct {
	
	
	public int subtractProductAndSum(int n) {
	        int product=1;
	        int sum=0;
	        
	        while(n>0) {
	        int temp=n%10;
	            product*=temp;
	            sum+=temp;
	        
	            n=n/10;
	    } 
	        System.out.println(product-sum);
	        return product-sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubtractProduct s=new SubtractProduct(); 
		s.subtractProductAndSum(234);
	}

}
