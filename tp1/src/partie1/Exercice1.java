package partie1;
import java.util.Scanner;
public class Exercice1 {
public static void main(String [] args) {
	System.out.print("Saisir un nombre:");
	Scanner sc = new Scanner(System.in);
	int a =sc.nextInt();
	if(a>0) {
		System.out.print(a+" est positif.");
	}
	else if(a<0) {
		System.out.println(a+" est nigatif.");
		
	}else System.out.println(a+" est null.");
}

}