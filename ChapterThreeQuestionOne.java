public class ChapterThreeQuestionOne {
	
	public static void main(String args[]) { 
	
		int x;
		do {
			 x = IBIO.inputInt("Enter a number greater than 0, less than 100 and a number that is odd ");
			} 
			while (x > 100 || x%2 == 0 || x < 0);
		IBIO.output("thank you");
	}
}

