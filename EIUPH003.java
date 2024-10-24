import java.util.*;

public class EIUPH003 {
	
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		long a = reader.nextLong();
	    long b = reader.nextLong();
		long c = reader.nextLong();
		if (a > b && a < c) {
			System.out.println(a);
		} else if (a > c && a < b) {
			System.out.println(a);
		} else if (b > a && b < c) {
			System.out.println(b);
		} else if (b > c && b < a) {
			System.out.println(b);
		} else if (c > b && c < a) {
			System.out.println(c);
		} else if (c > a && c < b){
			System.out.println(c);
		} else if (a == b || a == c) {
			System.out.println(a);
		} else if (b == a|| b == c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
		

		//This line has been changed
		System.out.println("Hello World");
	}

}
