public class printFormat {
	
	public static void main (String[] args) {
		
		int n = IBIO.inputInt("Enter a term ");
		int digits = 0;
		for(long a = n; a > 0;a=a/10) { 
				digits++;
			}
		for (int i = 0; i>digits; i++) {
			n = (String)n/4;
			System.out.println(n);
		}
	}
}

