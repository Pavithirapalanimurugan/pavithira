package guvi;
import java.util.Scanner;
public class vowels {
public static void main(String[] args){
	char ch  ;
	Scanner car = new Scanner(System.in);
	ch = car.next().charAt(0);
	if(ch=='a' || ch== 'e' || ch=='i' || ch == 'o' || ch == 'u'){
		System.out.println("the char contains vowels");
	}
	else{
		System.out.println("the char contains consonants");
	}
}
}
