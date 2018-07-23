package milestone2;
import java.util.Scanner;
public class position {
	public static void main(String[] args) {
		int num;
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		int [] a = new int[num];
		for(int i =0 ; i < num ; i++){
			a[i] = in.nextInt();
		}
		for(int i = 0 ; i < num ; i++){
			if(a[i] % 2 != 0 && i % 2 == 0 || a[i] % 2 == 0 && i % 2 !=0){
				System.out.println(a[i]);
			}
		}
		}

}
