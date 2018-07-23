package milestone2;
import java.util.Arrays;
import java.util.Scanner;
public class largest {
	public static void main(String[] args) {
		int num,a=0,count =0;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the no. of elements");
        num = in.nextInt();
        int [] arr =  new int[num];
        for(int i = 0 ; i< num ; i ++){
        	arr[i] = in.nextInt();
        }
        for(int i =0 ; i < num ; i++ ){
        	count = 0 ;
        	for(int j =0 ; j < num ; j++){
        		if(arr[i] == arr[j]){
        			count++;
        		}
        	}
        }
        if(count == 1){
        Arrays.sort(arr);
        for(int i = num-1 ; i >= 0 ; i--){
        	System.out.print(arr[i]);
        	 
        }
	}
        else{
        	System.out.println("numbers are repeated");
        }
	}
}
