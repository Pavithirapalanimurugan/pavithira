package milestone2;
import java.util.Arrays;
import java.util.Scanner;
public class index {
public static void main(String[] args) {
	int num,a=-1;
	Scanner in = new Scanner(System.in);
	num = in.nextInt();
	int count=0;
	int [] arr = new int[num];
	for(int i = 0 ; i < num ; i++){
		arr[i] = in.nextInt();
	}
	Arrays.sort(arr);
	for(int i=0;i<num;i++){
		if(arr[i] == i){
			System.out.print(arr[i]);
			count++;
		}
	}
	if(count==0){
		System.out.println(a);
	}

	}
}

