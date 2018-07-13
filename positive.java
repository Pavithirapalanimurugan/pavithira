package milestone2;
import java.util.Scanner;
public class pos {
	public static void main(String[] args) {
		int num;
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		if(num >= 1 && num <= 1000 ){
			System.out.println("positive");
		}
		else if(num < 0){
			System.out.println("negative");
		}
		else{
			System.out.println("zero");
		}
	}

}
