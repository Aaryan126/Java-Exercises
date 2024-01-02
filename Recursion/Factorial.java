public class Factorial {
	
	public static void main (String[] args) {
		
		int res = fun(5);
		System.out.println(res);
		
	}
	
	public static int fun(int n) {
		
		if (n==0 || n == 1) {
			return 1;
		} else {
			return n*fun(n-1);
		}
		

	}
}

