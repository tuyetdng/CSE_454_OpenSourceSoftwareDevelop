import java.util.*;

public class EIUPH006 {

	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		int n = reader.nextInt();
		int count = 0; 
		public static boolean checkSNT(int n){  //Phuong thuc kiem tra SNT
	        if(n > 1){
	        for(int i = 2; i <= Math.sqrt(n); i++){
	            if(n % i == 0) return false;    //So chia het cho 2 khong phai la SNT
	        }
	            return true;
	        }
	        else                               //1 khong phai la SNT
	            return false;
	    }
	    
		for (int i = 1; i <= n; i++) {
			if(n % i == 0 && (checkSNT(i))) {
				count++
			}
		}
	
     }
}
