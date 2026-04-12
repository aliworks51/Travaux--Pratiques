package tp4;

public class TestBanque {

	public static void main(String[] args) {
		Compte[] Compte = new Compte[4];
		Compte[0] = new CompteCourant("1","ali",1500,500);
		Compte[1] = new CompteEpargne("2","said",2000,0.1);
		Compte[2] = new ComptePremium("3","khalid",500,200);
		Compte[3] = new CompteCourant("4","samir",3000,1500);
		
		for(int i = 0; i < 4; i++) {

		    if (Compte[i] instanceof CompteEpargne) {
		        ((CompteEpargne) Compte[i]).calculerInteret();
		    }
            Compte[i].deposer(0);
			Compte[i].retirer(2001);
		    Compte[i].afficher();
		}
		for(int i = 0; i < 4; i++) {

		    if (Compte[i] instanceof CompteEpargne) {
		        ((CompteEpargne) Compte[i]).calculerInteret();
		        Compte[i].afficher();
		    } 
		}
		Compte c = new CompteEpargne("5","adi",3200,0.02);
		CompteCourant cc = (CompteCourant) c;

	}

}
