package guvi;
import java.util.Arrays;
import java.util.Scanner;
public class large {

	public static void main(String[] args) {
		int [] arr = new int[3];
		String a;
		Scanner in = new Scanner(System.in);
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = in.nextInt();
			Arrays.sort(arr);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[2]);

	}

}
