
public class ChapterOneQuestionFour {
	
	public static void main (String[] args) {
		
		int m = 1;
		int increment = 1;
		int square = 1;
		int cube = 1;
		
		//while (n < 10) {
		System.out.println("Squares" + '\n');
			for (int i = 1; i<=10; i++) {
				square = m*m;
				m = m + 1;
				System.out.println(square);
			}
		System.out.println('\n' + "Cubes" + '\n');
			m = 1;
			for (int i = 1; i<=10; i++) {
				cube = m*m*m;
				m = m + 1;
				System.out.println(cube);
			}
			
			
			
		//}
	}
}

