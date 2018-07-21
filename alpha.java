package guvi;
import java.util.Scanner;
public class alpha {

	public static void main(String[] args) {
		char ch;
		Scanner al = new Scanner(System.in);
		ch = al.next().charAt(0);
		if( ch >='a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}

	}

}
