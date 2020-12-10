public class MockTest {
	
	public static void main (String[] args) {
		
		int min = 0;
		int max = 0;
		System.out.println("Aaryan Kandiah");
		double sum = 0;
		double avg = 0;
		int pf = 0;
		int x = 1;
		int p = IBIO.inputInt("How many numbers to process? ");
	
		while ( p < 5) {
			System.out.println("Error-number out of range.");
			p = IBIO.inputInt("How many numbers to process? ");
		}
		for (int i = 0; i<p; i++) {
			int a = IBIO.inputInt("Enter a number: ");
			if (i == 0) {
				max = a;
				min = a; 
			}
			if (a < 0) { // ignoring negative value
				break;
			}
			if (max < a) { // getting maximum value
				max = a;
			}
			else if (min > a) {// getting minimum value
				min = a;
			}
			sum = sum + a;
			do { // prime frequency
				x++;
			} while (a % x != 0);
			if (x == a ){
				pf = pf + 1;
			}
			x=1;
			avg = sum/p;
		
	}	
		System.out.println("Minimum: " + min + " Maximum: " + max);
		System.out.println("Range: " + (max-min));
		System.out.printf("Average: " + "%.3f\n", avg); // obstructing average to 3 decimals
		System.out.println("Prime frequency: " + pf);
	}
}

