public class Ch5Q2 {
	
	public static void main (String[] args) {
		
		double n = 0;
		double sum = 0;
		double den = 1;
		
		for (int i = 1; i<=100; i++) {
			sum = sum + n;
			den = i*i;
			n = 1/den;
		}
		System.out.println(sum);
		
	}
}

