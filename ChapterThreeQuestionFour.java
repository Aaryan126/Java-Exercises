public class ChapterThreeQuestionFour {
	
	public static void main (String[] args) {
	int numx = 1;
	int num = 1;
	int steps = 0;
	 
	 //num = IBIO.inputInt("Enter a number: ");
	 do {
			numx = IBIO.inputInt("Enter a number: ");
			numx = num;
			if (num%2 == 0) {
				num = num/2;
				steps = steps + 1;
				System.out.println(num + " ");
			}
			else {
				num = num*3 + 1;
				steps = steps + 1;
				System.out.println(num + " ");
				}
				System.out.println("The number of steps were " + steps);
		} 
	while (numx != 1);
	steps = 0;
	}
}

