import java.util.*;
public class Differencestring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		if(s1.length()>s2.length()) {
			System.out.println(s1 + " " + s2+" Difference --"+s2.substring(s1.length()));
		}
		else if(s1.length()<s2.length())
		{
			System.out.println(s1 + " " + s2+" Difference --"+s2.substring(s1.length()));
		}
	}

}
