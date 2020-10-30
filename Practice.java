import java.util.Scanner; 
// IDK how to do Question 8, not sure about 9 and 10 either.
// Also how to set up file with IBIO and how to submit -- folder, etc.
// to use long or int
public class Practice {
	
	public static void main (String[] args){
		long base = 1;
		double res = 1;
		double negPower;
		int length = 0;
		String dash = "--";
		
		IBIO.output("Aaryan Kandiah");
		while (base!= 0) {
			base = IBIO.inputInt("Enter the base: ");
			if (base == 0) {
				System.out.println(">Base = zero. Nothing to do.");
				System.out.println(">Program end.");
				System.exit(0);
			}
			long exponent = IBIO.inputInt("Enter the exponent: ");
			if (exponent < 0) {
				exponent = exponent*-1;
				for (int i=1; i <= exponent; i++){
					res = res * base;
				} 
				for (int i = (int)res; i > 0; i = i/10) {
					dash = dash + "-";
				}
				negPower = 1.0/res ;
				System.out.println(base + " to the power of " + -1*exponent + " = " + '\n' + " 1" + '\n' + dash  + "  =  "  + '\n'  + base + "^" + exponent + '\n' + '\n' + " 1" + '\n' + dash + " = " + negPower + '\n' + res );
				res = 1;
				exponent = exponent*-1; 
				dash = "-";
					//System.out.println(base + " to the power of " + -1*exponent + " = " + "1" + "/" + base + "^" + exponent + " = " + negPower);
					//System.out.println(base + " to the power of " + -1*exponent + " = " + "1" + "/" + res + " = " + negPower);
					//System.out.println(">Program end.");
					//System.exit(0); 
				//System.out.println("Warning: exponent should be positive");
				//System.out.println(">Program end.");
				//System.exit(0);
			}
			if (exponent > 0){
				for (int i=1; i <= exponent; i++){
					res = res * base;
				}
				System.out.println(base + " to the power of " + exponent + " = " + res);
				res = 1;
		//System.out.println(">Program end.");
			}
		}
	}
}
