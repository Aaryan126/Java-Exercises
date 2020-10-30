public class ChapterTwoQuestionSeven {
	
	public static void main (String[] args) {
		
		int count = 0;
		
		for(int i = 0; i <= 1000000; i++){
			if (i%2 != 0 && i%3 != 0 && i%5 != 0 && i%7 != 0) {
				count = count + 1;
			}
		}
		System.out.println(count);
	}
}

