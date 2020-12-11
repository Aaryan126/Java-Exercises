public class Ch5Q1 {
	
	public static void main (String[] args) {
	double n = 0.2;
	double sum = 0;
	
	for (int i=0; i<100; i++) {
		sum = sum + n;
		n = n*0.2;
		}	
	System.out.println(sum);
	}
}

