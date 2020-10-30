
public class ChapterOneQuestionSix {
	
	public static void main (String[] args) {
		
		int n = IBIO.inputInt("Enter the number of the Fibonacci sequences that should be calculated: ");
		int output = 1;
		int fterm = 3;
		int sterm = 4;
		int sum = 0;
		
		for (int i = 0; i <= n; i++){
			output = fterm + sterm;
			System.out.println(output);
			if (i%2 == 0){
			fterm = output;
			}
			else {
				sterm = output;
			}
			sum = sum + output;
		
		}
		System.out.println('\n' + "Sum is " + sum);
	}
}

