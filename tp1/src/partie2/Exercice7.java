package partie2;
import java.util.*;

public class Exercice7 {

    public static void main(String[] args) {

       
        System.out.print("Entrer la taille du tableau: ");
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] T = new int[N];
        System.out.println("saisir les element de tableau:");
        for(int i = 0 ; i < N ; i++) {
        	System.out.print("T["+i+"]=");
            T[i] = sc.nextInt();
                    
        }
        int PL = T[0];
        for(int i = 0 ; i < N ; i++) {
           if(T[i] > PL) {
        	   PL = T[i];
           }
        }
        System.out.print("le plus grand element dans tableau est :"+PL);
        
    }
}