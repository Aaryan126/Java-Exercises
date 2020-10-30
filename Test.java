
public class Test {
	
	public static void main (String[] args) {	
	int n = 1;
	int sqr = 1;
	int a = 1;
	String space = " ";
	int base =1;
	String aspace = " ";
	
	System.out.println("Aaryan Kandiah");
	base = IBIO.inputInt("Enter a positive number less than 10: ");
	
	// while (base >= 10) {}
	// while (base < 1) {}
		if (base >= 10) {
		System.out.println(">>>Error-invalid output");
		System.exit(0);
		}
		
		if (base < 1) {
			System.out.println(">>>Error-invalid output");
			System.exit(0);
		}
		for (int i = 1; i <= base; i++) {
			sqr = n*n;
			a = base*a;
			
			//System.out.println(n + " " + sqr + " " + a);
			//n = n + 1;
		
			for(int x = sqr; x > 0; x=x/10){
				
				if (x < 10) {
					space = "  ";
				}
				if (x > 10) {
				space = " ";
			}
		}
			for(int y = a; y > 0; y=y/10){
				
				if (y < 10) {
					aspace = "   ";
				}
				if (y < 100) {
					aspace = " ";
				}
				if (y < 1000) {
					aspace = "";
			}
		}
			System.out.println(n + space + sqr + " " + aspace + a);
			n = n + 1;
			space = " ";
		}
		
	}
		
}
