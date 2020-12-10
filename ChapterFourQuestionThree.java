public class ChapterFourQuestionThree {
	
	public static void main (String[] args) {
	
	//int x = IBIO.inputInt("Enter a number less than 1000: "); 
	int sqrf = 1;
	int sqrs = 1;
	//int i = 0;
	//int j = 0;
	int ans = 0;
	
	
	mainLoop : do {
		int num = IBIO.inputInt("Enter a number less than 1000: ");
			switch ( num ) {
				case 1:
					for (int i =1 ; i>num; i++) {
						sqrf = i*i;
						}
					System.out.println("Possible" + );
					break mainLoop;
				case 2:
					for (int j =1; j>num; j++) {
						sqrf = j*j;
						}
					System.out.println("wrong");
					break;
					}
		} while (true);
	}
}

