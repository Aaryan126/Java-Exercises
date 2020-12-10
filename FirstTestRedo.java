public class FirstTestRedo {
	
	public static void main (String[] args) {
		System.out.println("Aaryan Kandiah");
		
		int sqr = 1;
		int cube = 1;
		String space = "  ";
		int digit1 = 0;
		String space2 = "";
		int digit2 = 0;
		
		int n = IBIO.inputInt("Enter a number less than 10: " ) ;
		
		while (n> 10 || n<1) {
			System.out.println(">>>Error-invalid input");
			n = IBIO.inputInt("Enter a number less than 10: " ) ;
		}
		for (int i = 1; i<=n; i++) {
			sqr = i*i;
			for (int a = sqr; a>0;a=a/10) {
				digit1++;
			}
			if (digit1 == 2) {
				space = " ";
				}
			cube = cube*n;
			for (int b = cube; b > 0; b=b/10) {
				digit2++;
			}
			if (digit2 == 1) {
				space2 = "         ";
			}
			else if (digit2 == 2) {
				space2 = "        ";
			}
			else if (digit2 == 3) {
				space2 = "       ";
			}
			else if (digit2 == 4) {
				space = "      ";
			}
			else if (digit2 == 5) {
				space2 = "     ";
			}
			else if (digit2 == 6) {
				space2 = "    ";
			}
			else if (digit2 == 7) {
				space2 = "   ";
			}
			else if (digit2 == 8) {
				space2 = "  ";
			}
			else if (digit2 == 9) {
				space2 = " ";
			}
			System.out.println(i + space + sqr + space2 + cube);
			digit1 = 0;
			digit2 = 0;
			space2 = " ";
		}
	}
}

