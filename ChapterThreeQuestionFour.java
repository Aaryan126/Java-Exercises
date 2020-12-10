public class ChapterThreeQuestionFour {
	
	public static void main (String[] args) {
	
	int num = IBIO.inputInt("Enter a number: ");
	int steps = 0;
	 
	do {
		if (num%2 == 0) {
		num = num/2;	
		System.out.println(num);
		steps = steps + 1;
		}
		
		else {
		num = 3*num + 1;
		System.out.println(num);
		steps = steps + 1;	
		}
	}
	while (num != 1);
	
	System.out.println("The number of steps were " + steps);
	}
}

