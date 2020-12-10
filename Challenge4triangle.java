import java.util.*;
public class Challenge4triangle {
	
	public static int tri(int t) {
		if( t == 1 )
			return t;
		
		return t + tri( t-1 );
	} 
	public static void main (String args[]) {
	Scanner input = new Scanner(System.in);
	System.out.print("Which term of the triangular sequence to calculate? ");
	int t = input.nextInt();
	System.out.println( t + "th term = " + tri(t) );
	}
}
