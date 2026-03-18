package partie3;
import java.util.*;
public class Exercice10 {

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
		int [][]T = new int[3][3];
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
		       T[i][j] = M[j][i];
			}
		}
		System.out.println("la  de M est :");
		for(int i = 0 ; i < 3 ; i++) {
			System.out.print("| ");
			for(int j = 0 ; j < 3 ; j++) {
				System.out.print(M[i][j]+" ");
				
			}
			System.out.println("|");
		}
        System.out.println("la transposee de M est :");
		System.out.println("la  de M est :");
		for(int i = 0 ; i < 3 ; i++) {
			System.out.print("| ");
			for(int j = 0 ; j < 3 ; j++) {
				System.out.print(T[i][j]+" ");
				
			}
			System.out.println("|");
		}
	}

}

