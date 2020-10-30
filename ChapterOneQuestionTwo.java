
public class ChapterOneQuestionTwo {
	
	public static void main (String[] args) {
		
	int step = IBIO.inputInt("Enter the number of steps: ");
	int start = IBIO.inputInt("Enter the first number: ");
	int increment = IBIO.inputInt("Enter the increment: ");
	int result = start;
	System.out.println(start);
	for (int i = 2; i <= step; i++) {
		result = result + increment;
		System.out.println(result);
	}
	}
}
