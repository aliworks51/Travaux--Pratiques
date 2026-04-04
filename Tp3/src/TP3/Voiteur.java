package TP3;

public class Voiteur extends Vehicule{
	private int nbPortes;
	public Voiteur(String matricule, String marque) {
		super(matricule,marque);
		nbPortes = 4;
	}
	public void stationner() {
		System.out.println("La voiteure se gare dans une place standard.");
	}
	public void afficher() {
		super.afficher();
		System.out.println("Le nombre de portes : "+nbPortes);
	}

}
