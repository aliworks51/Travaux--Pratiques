package tp4;

public class CompteEpargne extends Compte {
	private double tauxInteret;
	public CompteEpargne(String numero,String titulaire,double solde,double tauxInteret) {
		super(numero,titulaire,solde);
		this.tauxInteret=tauxInteret;
	}
	public void calculerInteret() {
		double Interet = (solde * tauxInteret); 
		solde +=  Interet;   
	}
	
	public void retrait(double montant) {
		
		if(montant <=0 || montant > solde) {
			System.out.println("solde insuffisant");
		}else {solde -= montant;}
	}

}
