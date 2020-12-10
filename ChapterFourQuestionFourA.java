public class ChapterFourQuestionFourA {
	
	public static void main (String[] args) {
		
		int num = IBIO.inputInt("Enter a number less than 1000: ");
		int i = 0;
		int j = 0;
		int sf = 1;
		int ss = 1;
		int sum = 1;
		
		while (num > 1000) {
			num = IBIO.inputInt("Error : Enter a number less than 1000: ");
		}
		while (sf+ss<num) {
			for (int a = 1; a < num; a++) {
				i++;
				j++;
				sf = i*i;
				ss = j*j;
				if (sf+ss == num) {
					System.out.println("Possible, numbers are " + sf + " and " + ss);
					System.exit(0);
				}
			}
		}
		System.out.println("Impossible");
	}
}

