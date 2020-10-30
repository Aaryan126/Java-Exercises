public class ChapterThreeQuestionThree {
	
	public static void main(String args[]){
	
	int cube = 1;	
	int sum = 0;
	int n = IBIO.inputInt(" enter a number ");
	do {
		int digit = n % 10; // get right most digit
		cube = digit*digit*digit;
		sum = sum + cube; // add to units digits
		n = n / 10; // make new number
		} 
		while ( n != 0);
		IBIO.output("the sum of the digits of the number is " + sum);
	}
}

