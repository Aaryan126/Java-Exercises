import java.util.*;
public class Challenge4triangle {
	
	public static int tri(int n) {
	
	int ans = 1; 
	int m = 1;
	
	ans = n*(n+1)/2;
	return ans;
	} 
	public static void main (String args[]) {
	Scanner input = new Scanner(System.in);
	System.out.print("Which term of the triangular sequence to calculate? ");
	int t = input.nextInt();
	System.out.println( t + "th term = " + tri(t) );
	}
}
