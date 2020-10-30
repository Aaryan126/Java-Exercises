
public class PracticeR {
	
	public static void main (String[] args) {
		
		int base = 1;
		int exponent;
		double result = 1;
		double negativePower = 1;
		String dash = "-";
		
		IBIO.output("Aaryan Kandiah");
		
		while (base != 0) {
	
		base = IBIO.inputInt("Enter the base     : ");
		exponent = IBIO.inputInt("Enter the exponent : ");
		
		if (base == 0) {
			System.out.println(">Base = zero. Nothing to do.");
			System.out.println(">Program end.");
			System.exit(0);
		}
		
		if (exponent < 0) {
			exponent = exponent*-1;
			for (int i = 1; i <= exponent; i++) {
				result = result*base;
				negativePower = 1/result;
			}
			for (int i = (int)result; i > 0; i = i/10) {
			dash = dash + "-";
		}
			exponent = exponent*-1;
			System.out.println(base + " to the power of " + exponent + " = " + '\n' + " 1" + '\n' + dash + " = " + '\n' + base + "^" + exponent + '\n' + " 1" + '\n'  + dash + " = " + negativePower + '\n' + " " + (int)result);
			System.out.println(">Program end.");
			dash = "-";
			result = 1;
			//System.out.println("Warning: exponent should be positive");
			//System.out.println(">Program end.");
		}
		
		if (exponent >= 0) {
			for (int i = 1; i <= exponent; i++) {
				result = result*base;
			}
		System.out.println(base + " to the power of " + exponent + " = " + result);
		System.out.println(">Program end.");
		}
	}
}
}

