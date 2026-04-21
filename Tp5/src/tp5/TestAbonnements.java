package tp5;

public class TestAbonnements {

	public static void main(String[] args) {
		Abonnement[] tab = new Abonnement[3];
        tab[0] = new AbonnementVideo("ali",300,50,true,false);
        tab[1] = new AbonnementMusique("khalid",200,30,20,true);
        tab[2] = new AbonnementJeux("said",500,100,40,10);
        for(int i =0 ; i<3 ;i++) {
        	tab[i].afficherinfos();	
        }
        
        Reducible[] redu = new Reducible[2];
        redu[0] =  new AbonnementVideo("ali",300,50,true,false);
        redu[1] = new AbonnementMusique("khalid",200,30,20,true);
        
        for(int i =0 ; i<2 ;i++) {
        	 System.out.println("20%: " + redu[i].AppliquerReduction(0.20));
             System.out.println("50%: " + redu[i].AppliquerReduction(0.50));
        	
        	
        }
	}

}
