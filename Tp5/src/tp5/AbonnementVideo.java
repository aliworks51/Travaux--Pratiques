package tp5;

public class AbonnementVideo extends Abonnement implements Reducible{
    protected boolean optionHd;
    protected boolean option4k;
    private double prix;
    private int score;
	public AbonnementVideo(String nom,double prixBase,int nbProfils,boolean optionHD,boolean option4K) {
		super(nom,prixBase,nbProfils);
		this.optionHd = optionHD;
		this.option4k = option4K;
	}
	
	public double calculerCoutMensuel(){
		prix = getPrixBase();
		if(optionHd) {
			prix += 10;
		}
		else if(option4k) {
			prix += 20;
		}
		return prix;
	}
	
	public int calculerScoreSatisfaction() {
		score = 60;
		if(optionHd) {
			score += 10;
		}
		if(option4k) {
			score += 20;
		}
		if(getNbProfils() >= 4) {
			score += 10;
		}else if(score > 100) {
			score = 100;
		}
		return score;
	}
	public double AppliquerReduction(double pourcentage) {
		    if(pourcentage > 0.3) {
		    	return calculerCoutMensuel();
		    }else {
			return calculerCoutMensuel() - (calculerCoutMensuel() * pourcentage);}
	}
    public boolean EstEligibleReduction(double pourcentage) {
    	
    		return pourcentage <= 0.30;
    	}
    public void afficherinfos() {
    	System.out.println("Abonnement Video:");
    	super.afficherinfos();
    	System.out.println("le cout mensuel de Abenement Video: "+calculerCoutMensuel());
    	System.out.println("le score de Abenement vedeo: "+calculerScoreSatisfaction());
    }
 
}
