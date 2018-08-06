package milestone2;
import java.util.Scanner;
public class rev {

	public static void main(String[] args) {
		String s;
		Scanner in = new Scanner(System.in);
		s = in.nextLine();
		String s1 = new StringBuffer(s).reverse().toString();
		System.out.println(s1);

	}

}
