package tp5;

public class AbonnementJeux extends Abonnement{
    protected int nbJeuxInclus;
    protected int heursJeuParMois;
    private double prix;
    private int score;
    public AbonnementJeux(String nom,double prixBase,int nbProfils,int nbJeuxInclus,int heursJeuParMois ) {
		super(nom,prixBase,nbProfils);
		this.nbJeuxInclus = nbJeuxInclus;
		this.heursJeuParMois = heursJeuParMois;
    }
    public double calculerCoutMensuel() {
    	prix = getPrixBase();
    	if(nbJeuxInclus > 5) {
    		prix += 25;
    	}
    	if(heursJeuParMois > 40) {
    		prix += 14;
    	}
    	return prix;
    }
    public int calculerScoreSatisfaction() {
    	score = 40;
    	if(nbJeuxInclus > 30) {
    		score =+ 20;
    	}
    	if(heursJeuParMois >= 20) {
    		score += 20;
    	}
    	if(getNbProfils() > 1) {
    		score += 10;
    	}
    	if(score > 100) {
    		score = 100;
    	}
    	return score;
    }
    public void afficherinfos() {
    	System.out.println("Abonnement Jeux:");
    	super.afficherinfos();
    	System.out.println("le cout mensuel de Abenement Jeux: "+calculerCoutMensuel());
    	System.out.println("le score de Abenement Jeux: "+calculerScoreSatisfaction());
    }
}
