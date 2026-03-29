package Tp2;

//1
public class Banque {
	public String nom;
	public int nbActuels = 0; 
	public CompteBancaire[] compte;

//2
	public Banque(String nom,int capaciteMax) {
		this.nom = nom;
		compte = new CompteBancaire[capaciteMax];
	}

//3
	public void AjouterCompte(CompteBancaire c) {
		if(nbActuels < compte.length) {
			compte[nbActuels] = c;
			nbActuels++;
		}else System.out.print("compte plein.");
	}

	public void afficherTous() {
		for(int i = 0 ; i < nbActuels ; i++) {
			compte[i].affich();
		}
	}
}