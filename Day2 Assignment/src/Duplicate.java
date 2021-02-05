import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.*;
public class Duplicate {

	public static void main(String[] args) {
		String regexp = "(\\b\\w+\\b)(\\s*\\1\\b)+";
		Pattern p = Pattern.compile(regexp, Pattern.CASE_INSENSITIVE);
	
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		
		
		while(N>0) {
			String str = sc.nextLine();
			Matcher Match1 = p.matcher(str);
			
			while(Match1.find())
			{
				str = str.replaceAll(Match1.group(), Match1.group(1));
				
			}
			System.out.println(str);
		}

	}

}
