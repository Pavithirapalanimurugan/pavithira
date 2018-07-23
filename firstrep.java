package milestone2;
import java.util.Scanner;
public class firstrep {
public static void main(String[] args) {
		int n,count = 0,count1=0;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int [] arr = new int[n]; 
		for(int i =0 ;i < n ; i++){
			arr[i] = in.nextInt();
		}
		for(int i = 0 ; i < n ; i++){
			count = 0;count1 = 0;
			for(int j = i ; j < n ; j++){
				if(arr[i] == arr[j]){
					count++;
				}
			}if(count == 2)
	
				count1++;
				System.out.println(arr[i]);
				break;
			}
		}

	}


