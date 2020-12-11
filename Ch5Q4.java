public class Ch5Q4 {
	
	public static void main (String[] args) {
	
	double top = 1;
	double bottom = 3;
	double sum = 1;
	double term = top/bottom;
	double inc1 = 2;
	double inc2 = 5;
	
	for (int i = 0; i < 100; i++) {
		sum = sum + term;
		top = top*inc1;
		inc1 = inc1+1;
		bottom = bottom*inc2;
		inc2 = inc2+2;
		term = top/bottom;
	}
	System.out.println(sum*2);
	}
}

