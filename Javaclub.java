public class Javaclub {
	
	public static void main (String[] args) {
		
		// First activity
		
	/*	int n = IBIO.inputInt("Enter a number: ");
		int ans = 1;
		
		for(int i = 1; i <= 10; i++) {
			ans = n*i;
			System.out.println(n + " " + "x " + i + " =" + " " +  ans);
		}
		ans = 1;
	*/	
	
	// Second activity
	
	/* int td = 111;
	int n = IBIO.inputInt("Enter the number of three digit numbers you want to print: ");
	
		for(int i = 0; i<=n; i++){
			int m = 111 + i;
			if (m>= 499){
				System.exit(0);
			}
			System.out.println(m);
		}
		*/
		
	// Third activity
		
		for (int i = 1; i <=100; i++) {
			if (i%3 == 0) {
				System.out.println("3: " + i);
			}
		}
		for (int i = 1; i <=100; i++) {
			if (i%5 == 0) {
				System.out.println("5: " + i);
			}
		}
		for (int i = 1; i <=100; i++) {
			if (i%3 == 0 && i%5 ==0) {
				System.out.println("3 & 5: " + i);
			}
		}
	}
	
	
}

