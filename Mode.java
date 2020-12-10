public class Mode {
	
	public static void main (String[] args) {
		
		int p = IBIO.inputInt("How many numbers do you need to find the median of? ");
		int max = 0;
		
		for (int i = 0; i < p; i++) {
			int a = IBIO.inputInt("Enter a number: ");
			if (i == 0) {
				max = a;
			}
			if (max > a) { 
				max = a;
			}
			System.out.println("Mode: ");
		}
	}
}

