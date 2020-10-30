
public class ChapterOneQuestionThree {
	
	public static void main (String[] args) {
		
		int num1 = 1; 
		int num2 = 3; 
		int last = 100;
		int n = 1;
		int m = 1;
		
		while ( m < 100) {
			System.out.println(num1);
			n = n + 1;
			m = m + 1;
			num1 = num1 + n;
		}
	}
}

