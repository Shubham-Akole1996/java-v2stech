import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
public class UsernameRegex {

	public static void main(String[] args) {
		String regexp = "^[A-Za-z_][A-Za-z0-9_]{7,29}";
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		
		while(N>0) {
			String username = sc.next();
			if(username.matches(regexp)) {
				System.out.println("valid");
			}
			else {
				System.out.println("invalid");
			}
					
		}
	}

}
