
public class ChapterOneQuestionFive {
	
	public static void main (String[] args) {
		
		int square = 1;
		String space = "  ";
		
		for(int x = 1; x <= 20; x++){
		
			for (int i = 1; i <= x; i++) {
				square = square * 2;
			}
			if (x>=10) {
				space = " ";
			}
			System.out.println(x + space + square);
			square = 1;
		}
		
	}
}

