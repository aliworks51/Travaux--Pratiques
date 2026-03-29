package Tp2;

public class TestBanque {

    public static void main(String[] args) {
//1
        Banque banque = new Banque("MarocBank", 1500);

//2
        CompteBancaire c1 = new CompteBancaire("Ali", 1000, 500);
        CompteBancaire c2 = new CompteBancaire("Hassan", 2000, 1000);
        CompteBancaire c3 = new CompteBancaire("Sofian", 1500, 700);
// 3
        banque.AjouterCompte(c1);
        banque.AjouterCompte(c2);
        banque.AjouterCompte(c3);
// 4
        c1.deposer(500);      
        c1.retirer(1500);     
        c2.virementVers(c3, 400);  
// 5
        System.out.println("tous les comptes:");
        banque.afficherTous();
 // 6
        double soldeAvecInteret = c2.calculerSoldeAvecInterets();
        double soldeAvecBonus = c2.calculerSoldeAvecInterets(0.015);
        System.out.println("soldeAvecInteret: "+ soldeAvecInteret);
        System.out.println("soldeAvecBonus: "+ soldeAvecBonus);
// 7
        System.out.println("Nombre total de comptes cree: " + CompteBancaire.getNbComptes());
        System.out.println("taux d'interet annuel: " + CompteBancaire.getTauxInteretAnnuel());
    }
}