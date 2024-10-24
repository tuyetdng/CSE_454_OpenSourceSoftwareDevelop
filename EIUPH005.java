import java.util.*;

public class EIUPH005 {
	
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		int old = reader.nextInt();
		String gender = reader.next();
		String m = "Nam";
		String f = "Nu";
		if (old <= 5) {
			System.out.println("Be");
		} else if (old <= 20) {
			System.out.println("Em");
		} else if (old <= 35 && gender.equals(m)) {
			System.out.println("Anh");			
		} else if (old <= 35 && gender.equals(f)) {
			System.out.println("Chi");
		} else if (old <= 60 && gender.equals(m)) {
			System.out.println("Chu");
		} else if (old <= 60 && gender.equals(f)) {
			System.out.println("Co");
		} else if (old > 60 && gender.equals(m)) {
			System.out.println("Ong");
		} else {
			System.out.println("Ba");
		}
     
	}

}
