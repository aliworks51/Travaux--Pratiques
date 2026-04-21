package tp5;

public class AbonnementMusique extends Abonnement implements Reducible{
	protected int nbPlaylists;
	protected boolean optionOffline;
	private double prix;
	private int score;

	public AbonnementMusique(String nom,double prixBase,int nbProfils,int nbPlaylists,boolean optionOffline ) {
		super(nom,prixBase,nbProfils);
		this.nbPlaylists = nbPlaylists;
		this.optionOffline = optionOffline; 
	}
	public double calculerCoutMensuel() {
		prix = getPrixBase();
		if(optionOffline) {
			prix += 15;
		}
		return prix;
	}
	public int calculerScoreSatisfaction() {
		score = 50;
		if(nbPlaylists > 20) {
			score += 20;
		}
        if(optionOffline) {
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
	public double AppliquerReduction(double pourcentage) {
	    if(pourcentage > 0.30) {
	    	return calculerCoutMensuel();
	    }else {
		return calculerCoutMensuel() - (calculerCoutMensuel() * pourcentage);}
    }
    public boolean EstEligibleReduction(double pourcentage) {
	
		return pourcentage <= 0.30;
	}
    public void afficherinfos() {
    	System.out.println("Abonnement Music:");

    	super.afficherinfos();
    	System.out.println("le cout mensuel de Abenement musuc: "+calculerCoutMensuel());
    	System.out.println("le score de Abenement music: "+calculerScoreSatisfaction());
    }

}
