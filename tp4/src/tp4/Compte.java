package tp4;

public class Compte {
	protected String numero;
	protected String titulaire;
	protected double solde;
	public Compte(String numero,String titulaire,double solde) {
		this.numero = numero;
		this.titulaire = titulaire;
		this.solde = solde;
	}
    
    public void deposer(double montant) {
    	if(montant <= 0){
    		System.out.println("invalide");
    	}
    	solde += montant;
    }
    public void retirer(double montant) {
    	if(montant <= 0 || montant > solde) {
    		System.out.println("le solde est insuffisant");
    	}
    	solde -= montant;
    }
    public void afficher() {
    	System.out.println("Numero : "+numero);
    	System.out.println("Titulaire : "+titulaire);
    	System.out.println("Solde : "+solde);
    }
}
