package exp2;
import java.util.Arrays;
import java.util.Scanner;
public class repeat {

	public static void main(String[] args) {
		int num,count=0,i;
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		int []arr = new int[num];
		int a[] = new int[num];
		for( i = 0 ; i < num ; i++){
			arr[i] = in.nextInt();
		}
		 Arrays.sort(arr);
	    for( i = 0 ; i < num ; i++){
			count =0;
	    for(int j = i ; j < num ; j++){
           			if(arr[i] == arr[j]){
           			count++;	
           			}
           		}
		if(count == 2){
			System.out.println(arr[i]);
		}
		}
	    if(count <= 1){
	    	System.out.println("unique");
	    }
	}

}
