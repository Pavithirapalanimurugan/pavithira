package guvi;
import java.util.Scanner;
public class leap {

	public static void main(String[] args) {
		int year;
		Scanner in  = new Scanner(System.in);
		year = in.nextInt();
		if(year % 4 == 0 && year %100 != 0 || year % 4 == 0 && year % 100 == 0){
				System.out.println("true");
			}
			else{
				System.out.println("false");
			}
		}
			
	}


