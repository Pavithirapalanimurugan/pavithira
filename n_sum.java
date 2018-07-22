package milestone2;
import java.util.Scanner;
public class n_sum {
	public static void main(String[] args) {
		int n,k,sum=0,i;
		Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int [] arr = new int[10];
        k = in.nextInt();
        for(i = 0 ; i < k ;i++){
        arr[i] = in.nextInt();	
        sum = arr[i] + i;
      
	}
	System.out.println(sum);
	}
}  

