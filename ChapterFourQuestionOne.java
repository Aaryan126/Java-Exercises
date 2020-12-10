public class ChapterFourQuestionOne {
	
	public static void main(String args[])
	{
		int i = 1;
		int a = IBIO.inputInt("Enter first number ");
		int b = IBIO.inputInt("Enter second number ");
		System.out.println("Press");
		System.out.println("[1] for addition");
		System.out.println("[2] for multiplication");
		System.out.println("[3] for quit");
		int num = IBIO.inputInt();
		
		do
		{ 
			if (i!=1) {
			a = IBIO.inputInt("Enter first number ");
			b = IBIO.inputInt("Enter second number ");
			System.out.println("Press");
			System.out.println("[1] for addition");
			System.out.println("[2] for multiplication");
			System.out.println("[3] for quit");
			num = IBIO.inputInt();
			}
			i++;
			switch (num)
			{ case 1:
				//a+b = num;
				System.out.println(a + " + " + b + " = " + (a+b));
			break;
			case 2:
				//a*b =num;
				System.out.println(a + " * " + b + " = " + (a*b));
			break;
			case 3:
				System.exit(0);
			}
//menu and switch in here
			} while (num != 3);
			
	}
}

