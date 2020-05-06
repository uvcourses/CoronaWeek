package daily.string;

public class Recursion {

	static int fib(int n,String ind) {
		System.out.println(n +" --- "+ind);
		if (n <= 1)
			return n;
	
		return fib(n - 1,"- 1") + fib(n - 2,"- 2");
	}

	public static void main(String args[]) {
		int n = 5; 
		System.out.println(0-2);
		
		System.out.println(fib(n,"- 0"));
	}

}
