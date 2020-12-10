public class Challenge3 {
	
	public static void decToBin(int n)
	{
		if( n == 0 ) {
		return; 
		}
		else {
		decToBin(n/2);
		
		}
		System.out.print(n%2);
	}
	public static void main (String args[]) {
		//Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer (base 10): ");
		int b10 = IBIO.inputInt();
		System.out.println();
		System.out.print( b10 + " base 10 = " );
		decToBin(b10);
		System.out.println(" base 2.\n");
	}
}

