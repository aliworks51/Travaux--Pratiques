package partie4;
import java.util.*;
public class Exercice12 {
	public static void main(String[] args) {
	System.out.print("Entrer une chaine de caracteres:");
	Scanner st = new Scanner(System.in);
	String chain = st.nextLine();
	int N = 0;
	for(int i = 0 ; i < chain.length() ; i++) {
		char C = chain.charAt(i);
		if(C == 'a' || C == 'e' || C == 'i' || C == 'o' || C == 'u' || C == 'y') {
			System.out.print(C+",");
			N +=1;
		}
	}
	System.out.println("");
	System.out.println("nombre de voyelles est: "+N);
  }
}
