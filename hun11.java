package milestone2;
import java.util.Scanner;
public class hun11 {
	public static void main(String[] args) {
		  String input;
		    Scanner ss=new Scanner(System.in);
		    input=ss.nextLine();
		    String a[]=input.split("\\s+");
		    for(int i=0;i<a.length;i++){
		        String output=new StringBuffer(a[i]).reverse().toString();
		        System.out.printf("%s ", output);
		    }


	}

}
