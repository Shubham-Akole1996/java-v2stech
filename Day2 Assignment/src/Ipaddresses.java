import java.util.*;
import java.util.regex.*;
public class Ipaddresses {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		String ip = sc.next();
		String reg  = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";
		
		 String regex   =  reg + "\\."+  reg + "\\."+  reg + "\\."+  reg; 
	     
		 System.out.println(Pattern.matches(regex,ip));

	}

}
