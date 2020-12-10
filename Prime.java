public class Prime {
	
	public static void main (String[] args) {
		int a = IBIO.inputInt("Enter a number: ");
		int x = 1;
		do {
				x++;
			} while (a % x != 0);
			if (x == a ){
				System.out.println("Prime");
			}
			else {
				System.out.println("Composite");
			}
	}
}

