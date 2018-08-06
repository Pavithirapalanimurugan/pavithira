package milestone2;
import java.util.Scanner;
public class inrev {
	public static void main(String[] args) {
		int a;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		String s = String.valueOf(a);
		String s1 = new StringBuffer(s).reverse().toString();
		System.out.println(s1);
	}
}
	
     
	

