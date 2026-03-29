package Tp2;

//1
public class CompteBancaire {
//2
		private int numero;
		private String titulaire;
		private double solde;
		private double decouvertAutorise;
//3
		private static int nbComptes=0;
		private static double taux = 0.03;
//4
		public CompteBancaire(){
			
			this.titulaire = "NULL";
			this.solde = 0.00;
			this.decouvertAutorise = 0.00;
			nbComptes++;
			this.numero = nbComptes;
		}
//5
		public CompteBancaire(String nom,double solde,double decouvertAutorise) {
			titulaire = nom;
			this.solde = solde;
			this.decouvertAutorise = decouvertAutorise;
			nbComptes++;
			this.numero = nbComptes;
		}
//6
		public String getNom(){
			return titulaire;
			}
		public double getDecov() {
			return decouvertAutorise;
		}
		public double getNum() {
			return numero;
		}
		public double getsold() {
			return solde;
		}
		
		
		public void setTitulaire(String nom) {
			if(nom != null && !nom.isEmpty()) {
				titulaire = nom;
			}else {
		        System.out.println("Nom est vide");
		    }
			
		}
		public void setDecovr(double decovr) {
			if(decovr >= 0) {
			decouvertAutorise = decovr;
			} else {
		        System.out.println("negatif");
		    }
		}
//7
		public void affich() {
			System.out.println("numero: " + numero);
			System.out.println(" Nom: "+titulaire);
			System.out.println(" Decovert autorise: "+decouvertAutorise);
			System.out.println(" Solde: "+solde);
		}
//8
	//a
		public void deposer(double montant) {
		    if (montant > 0) {
		        solde += montant;
		    } else {
		        System.out.println("Montant de depot invalide.");
		    }
		}
	//b
		public void retirer(double montant) {
		    if (montant > 0 && (solde - montant >= -decouvertAutorise)) {
		        solde -= montant;
		    } else {
		        System.out.println("Retrait refuse.");
		    }
		}
	//c
		public void virementVers(CompteBancaire autre, double montant) {
		    if (montant > 0 && (solde - montant >= -decouvertAutorise)) {
		        this.retirer(montant);
		        autre.deposer(montant);
		    } else {
		        System.out.println("Virement impossible : montant ou solde insuffisant.");
		    }
		}
//9
	//a	
		public double calculerSoldeAvecInterets() {
		    double nouveauSolde = solde + solde * taux;
		    return nouveauSolde;
		}
	//b
		public double calculerSoldeAvecInterets(double bonus) {
		    double nouveauSolde = solde + solde * (taux + bonus);
		    return nouveauSolde;
		}
//10
	
		public static int getNbComptes() {
		    return nbComptes;
		}

		public static double getTauxInteretAnnuel() {
		    return taux;
		}

		public static void setTauxInteretAnnuel(double tauxA) {
		    if (tauxA >= 0) {
		        taux = tauxA;
		    } else {
		        System.out.println("Taux  invalide.");
		    }
		}
		
}
