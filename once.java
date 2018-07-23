package milestone2;
import java.util.Scanner;
public class once {
public static void main(String[] args) {
		int n,count=0;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int [] arr = new int[n];
		for(int i = 0 ; i < n ; i ++){
			arr[i] = in.nextInt();
		}
		for(int i = 0 ; i < n ; i ++){
			count =0;
			for(int j = 0 ; j < n ; j ++){
				if(arr[i] == arr[j]){
					count++;
				}
			}
			if(count == 1){
				System.out.println(arr[i]);;
			}
		}

	}

}
