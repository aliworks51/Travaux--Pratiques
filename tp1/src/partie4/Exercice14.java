package partie4;
import java.util.*;
public class Exercice14 {
	public static void main(String[] args) {
	System.out.print("Entrer une chaine de caracteres:");
	Scanner st = new Scanner(System.in);
	String chain = st.nextLine();
	String invers = "";
	for(int i = 0 ; i < chain.length() ; i++) {
		char c = chain.charAt(chain.length()-1-i);
		invers += c;
	}

	if(chain.equals(invers)) {
			System.out.print("'"+chain+"' est un palindrom.");
	}else
			System.out.print("'"+chain+"'  n'est pas un palindrome.");
	
	
	} 
}
