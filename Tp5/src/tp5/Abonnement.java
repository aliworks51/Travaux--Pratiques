package tp5;
public abstract class  Abonnement {
	private String nom;
	private double prixBase;
	private int  nbProfils;
	public Abonnement(String nom,double prixBase,int nbProfils) {
		this.nom = nom;
		this.prixBase = prixBase;
		this.nbProfils = nbProfils;
		if(prixBase <= 0) {
			prixBase = 10;
		}
		if(nbProfils <= 0) {
			nbProfils = 1;
		}
	}
	public String getNom() {
	    return nom;
	}
	public double getPrixBase() {
		return prixBase;
	}
	public int getNbProfils() {
		return nbProfils;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrixBase(double prixBase) {
		this.prixBase = prixBase;
	}
	public void setNbprofils(int nbProfils) {
		this.nbProfils = nbProfils;
	}
	public  boolean estPaetageFamilial() {
		if(nbProfils >= 3) {
			return true;
		}else {return false;}
	}
	public void afficherinfos() {
		System.out.println("Nom: "+nom);
		System.out.println("Prix Base: "+prixBase);
		System.out.println("nombe de profils: "+nbProfils);
		System.out.println("partage familial: "+estPaetageFamilial());
	}
	public abstract double calculerCoutMensuel();
	public abstract int calculerScoreSatisfaction();

}
