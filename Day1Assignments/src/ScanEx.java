import java.util.*;
public class ScanEx {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
         
		int a = s.nextInt();
		double b = s.nextDouble();
		s.nextLine();
		String t = s.nextLine();
		s.close();
		System.out.println("String: " + t);
		System.out.println("Double: " + b);
		System.out.println("Int: " + a);
		
		
		
	}

}
