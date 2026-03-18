package partie3;
import java.util.*;
public class Exercice9 {

	public static void main(String[] args) {
		System.out.println("Saisir les element de matrice 3*3:");
		Scanner sc = new Scanner(System.in);
		int [][]M = new int[3][3];
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				System.out.print("M["+i+"]["+j+"]=");
				M[i][j] = sc.nextInt();
			}
		}
		int Some = 0;
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
		       Some += M[i][j];
			}
		}
        System.out.print("la somme de matrice et :"+Some);
	}

}

