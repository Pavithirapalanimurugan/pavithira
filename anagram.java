package milestone2;
import java.util.Scanner;
public class filter {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
String s1;
int count = 0;
s1=sn.nextLine();
String s2=sn.nextLine();
String[] arr =s2.split(":");
  for(int i = 0;i <arr.length;i++){
	  if(s1.length() == arr[i].length()){
	if(s1.charAt(0)==arr[i].charAt(0) && s1.charAt(1)==arr[i].charAt(1)){
			count++;
		}
	}
}
   for(int i = 0;i<arr.length;i++){
	if(s1.charAt(0)==arr[i].charAt(0) && s1.charAt(1)==arr[i].charAt(1)){
		if(s1.length()==arr[i].length()){
			System.out.print(arr[i].toUpperCase());
			if(i<count-1){
				System.out.print(":");
		}
		}
	}
  }
 	}
}
