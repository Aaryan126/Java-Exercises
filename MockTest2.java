public class MockTest2 {
	
	public static void main (String[] args) {
		
		int ans = 1;
		int m = 0;
		int digits = 0;
		System.out.println("Aaryan Kandiah");
		int n = 1; 
		
			while(n != 0) { //input
				m = 0;
				n = IBIO.inputInt("Enter an integer between 1 and 9: ");
				if (n == 0) {
					System.exit(0);
				}
			while (n<1 || n>9) {
				n = IBIO.inputInt("Error- Enter an integer between 1 and 9: "); // do we need italics?	// input error
				if (n==0) {
					break;
				}	
			}	
			
			for (int i = 0; i<n; i++) {	
				m = m+1;
				for (int x = 1; x<10; x++) { // i is 1 to 10
					ans = x*m;
					for(int o = ans; o > 0; o=o/10) { // counting number of digits in the answer, to put spaces according to that
						digits++;
					}
					if (digits == 1) {
						System.out.println(m + " x  "  + x + "  =   " + ans); // digits = 1
						digits = 0;
						}
					else if (digits == 2){
						System.out.println(m + " x  " + x + "  =  " + ans); // digits = 2
						digits = 0;
						}
					else { 
						System.out.println(m + " x  " + x + "  = " + ans); // digits = 3
						digits = 0;
						}
					}
				for (int x = 10; x<21; x++) {
					ans = x*m;
					for(int o = ans; o > 0; o=o/10) {
						digits++;
					}
					if (digits == 1) {
						System.out.println(m + " x "  + x + "  =   " + ans);
						digits = 0;
						}
					else if (digits == 2){
						System.out.println(m + " x " + x + "  =  " + ans);
						digits = 0;
						}
					else { 
						System.out.println(m + " x " + x + "  = " + ans);
						digits = 0;
						}
					}
					System.out.println("------------");
					
			
		} 
	}
}

