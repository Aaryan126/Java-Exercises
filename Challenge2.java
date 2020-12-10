import java.util.Scanner;
	public class Challenge2 {
				
	public static int mult(int a, int b) 
	{
		
		if( b == 1 )
		{
			return a;
		}
		else {
			
		return a + mult(a,b-1);
	}
		
	}
	public static void main(String args[]) {
		
	Scanner input = new Scanner(System.in);
		
	System.out.print("x = ");
	int x = input.nextInt();
	System.out.print("y = ");
	int y = input.nextInt();
	System.out.println( "\n"+x+" * "+y+" = "+mult(x,y) );
	}
}
