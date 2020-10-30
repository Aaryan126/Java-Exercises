public class ChapterThreeQuestionTwo {
	
	public static void main (String[] args) {
		
		public static void main(String args[]) {
			
			int i = 1;
			int x = IBIO.inputInt("Enter a number greater than 1: ");
			if (x>1) {
				do {
					 i++;
					} 
				while (x % i != 0);
				IBIO.output(x + " is divisible by " + i);
			}	
			else {
				System.out.println("Error");
			}
		}
	}

