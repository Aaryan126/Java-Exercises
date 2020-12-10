public class Median {
	
	
	public static void main (String[] args) {
		
		int p = IBIO.inputInt("How many numbers do you need to find the median of? ");
		double array[] = new double [p];
		double div = 1;
		
		for (int i = 0; i < p; i++){
			int a = IBIO.inputInt("Enter a number: ");
			array[i] = a;
		}
		if (p%2 == 0) {
			div = (array[p/2 - 1] + array[p/2])/2;
			System.out.println("Median: " + div);
		}
		else {
			div = array[(p+1)/2 - 1];
			System.out.println("Median: " + div);
		}
	}
}

