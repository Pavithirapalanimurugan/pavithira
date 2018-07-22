package milestone2;
import java.util.Scanner;
public class sum {

	public static void main(String[] args) {
		int num,sum = 0;
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		for(int i = 1 ; i <= num ; i++){
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
