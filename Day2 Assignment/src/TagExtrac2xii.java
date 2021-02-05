import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagExtrac2xii {

	public static void main(String[] args) {
		String regexp = "<(.+?)>([^<>]+)</\\1>";
		Pattern p = Pattern.compile(regexp);
	
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		
		
		while(N>0) 
		{
			String str = sc.nextLine();
			Matcher Match1 = p.matcher(str);
			boolean invalid = true;
			while(Match1.find())
			{
				System.out.println(Match1.group(2));
				invalid = false;
			}
			if(invalid)
			{
			System.out.println("nothing");
			}
			
			
		}
			

	}

}
