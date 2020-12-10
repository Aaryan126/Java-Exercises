public class ChapterFourQuestionThree {
	
	public static void main (String[] args) {
	int x = 1;
	int y = 1;
	int num = IBIO.inputInt("Enter a number: ");
	int ans = x*x + y*y; 
	
	while(ans <= num) {
		if (ans == num) {
			System.out.println("Possible");
			System.exit(0);
			}
		x = x+1;
		y = y+1;
		ans = x*x + y*y; 
		}
	System.out.println("Impossible");
	}
}

