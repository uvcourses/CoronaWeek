package daily.string;

public class AmstrangNumber {
	public boolean isArmstrong(int N) {

		int length = 0;
		int amstrang=0;
		boolean result = false;
        int temp=N;
		length=digitLength(N);
		
		while(temp>0) { 
			
			int base =temp%10;
			amstrang+=Math.pow(base, length);
			temp/=10;
		}
		
		return N==amstrang;

	}
	
	private int digitLength(int n) { 
		
		int len=0; 
		while(n>0) { 
			n/=10; 
			len++;
		}
		return len;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AmstrangNumber a=new AmstrangNumber(); 
		a.isArmstrong(153);
	}

}
