package milestone2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class secondlarge {
	public static void main(String[] args) {
		int n,k,m=0;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		k = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i ++){
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		for(int i = n-1 ;i >= 0;i --){
			m++;
			if(m==k){
				System.out.println(arr[i]);
			}
			}
		}
	}




	

