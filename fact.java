package milestone2;
import java.util.Scanner;
public class fact {
	public static void main(String[] args) {
		int a,fact = 1;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		for(int i = 1;i <= a;i ++){
			fact = fact * i;
		}
		System.out.println(fact);
	}
}

