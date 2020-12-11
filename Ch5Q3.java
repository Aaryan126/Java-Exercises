public class Ch5Q3 {
	
	public static void main (String[] args) {
		
		double num = -1;
		double denom = 3;
		double term = num/denom;
		double sum = 0;
		double neg = 0;
		
		for (int i = 0; i <= 10000; i++) {
			
			//System.out.println(term);
			sum = sum + term;
			denom = denom + 2;
			num = -1*num;
			term = num/denom;
			
		}
		sum = (1 + sum)*4;
		System.out.println(sum);
	}
}

