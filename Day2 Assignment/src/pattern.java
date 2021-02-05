import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
public class pattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		
		while(N>0)
		{
			N=N-1;
			String s = sc.next();
			
			
			try {
			 Pattern.compile(s);			
			System.out.println("Valid");
			}
			catch(PatternSyntaxException exception) {  //Unchecked exception thrown to indicate a syntax error in aregular-expression pattern
				System.out.println("invalid");
			}
			
		}
	}
}
