public class CSTESTe {
	
	public static void main (String[] args) {
		
		System.out.println("Aaryan Kandiah");
		
		long output = 0;
		long fterm = 0;
		long sterm = 1;
		long fin = 0;
		double sum = 0;
		double avg = 0;
		int n = 1;
		int digits = 0;
		
		while (n!= 0) {
			n = IBIO.inputInt("Calculate up to the term (n)? ");
				if (n == 0) {
				System.exit(0);
			}
			output= 0;
			sum= 0;
			fterm= 0;
			sterm= 1;
			avg= 0;
			fin= 0;
		
		while ( n < 0) {
			n = IBIO.inputInt("Error- enter a positive number.");
			}
		for (int i = 0; i <= n; i++){
			if (i == 0) {
				if (n < 20) {
				System.out.print(fterm + "; ");
				}
				sum = sum + sterm;
			}
			else if (i == 1) {
				if (n<20) {
				System.out.print(sterm + "; ");
				}
			}
			else {
			output = fterm + sterm;
			fterm = sterm;
			sterm = output;
			sum = sum + output;
			if (n<20) {
			System.out.print(output + "; ");
			}
			}
			fin = sterm;
			}
		avg = sum/n;
		System.out.println(fin);
		System.out.println("Average = " + avg);
		for(long a = output; a > 0;a=a/10) { 
				digits++;
			}
		System.out.println(output + " has " + digits + " digits");
		digits = 0;
		}
	}
}
