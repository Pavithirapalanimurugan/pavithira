package milestone2;
import java.util.ArrayList;
import java.util.Scanner;
public class containnum {
public static void main(String[] args) {
		int num,num1,input;
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		num1 = in.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		for(int i = 0 ; i < num ; i ++){
			input = in.nextInt();
			a.add(input);
		}
		for(int i = 0 ; i < num1 ; i ++){
			input = in.nextInt();
			b.add(input);
		}
		if(a.containsAll(b)){
	    System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
}
}
