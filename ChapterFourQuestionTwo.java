public class ChapterFourQuestionTwo {
	
	public static void main(String args[])
	{
		int x = 0;
		int ans = 0;
		int num = 0;
		long sum = 0;
		
		while ( x < 1000) {
			x=x+1;
			if (x%3 == 0) {
				num = 1;
				}
			else if (x%3 == 1) {
				num = 2;
			}
			else if (x%3 == 2) {
				num = 3;
			}
			switch (num){
				case 1:
					ans = (x*-5);	
					sum = sum + ans;
					System.out.println();
					break;
				case 2:
					ans = (x*7);
					sum = sum + ans;
					System.out.println(sum);
					break;
				case 3:
					ans = (x*2);
					sum = sum + ans;
					System.out.println(sum);
			}
		}
		System.out.println(x);
		System.out.println();
		System.out.println(sum);
	}
}

