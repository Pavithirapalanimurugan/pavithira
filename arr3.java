package milestone2;
import java.util.Scanner;
public class arr3 {
public static void main(String[] args) {
		int n;
		Scanner in = new Scanner (System.in);
		n = in.nextInt();
		int [] a = new int[n];
		for(int i = 0 ; i < n ; i ++){
			a[i] = in.nextInt();
		}
		for(int i = 0 ; i < n ; i ++){
			for(int j = i ; j < n ; j ++){
			for(int k = i+1 ; k < n ; k++){
				if(a[i] + a[j] == a[k] ){
						if(a[i] < a[j] && a[j] < a[k]){
					System.out.println(a[i]+" "+a[j]+" "+a[k]);
				}
			}
			}
		}

	}
}
}
