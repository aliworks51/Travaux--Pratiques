package TP3;

public class TestParking {

	public static void main(String[] args) {
		//a
		Vehicule[] v = new Vehicule[4];
		//b
		v[0] = new Voiteur("39","dacia"); 
		v[1] = new Voiteur("38","pegot");
		v[2] = new Moto("39","BMW",true);
		v[3] = new Camion("42","MAN",28);
		//c
		for (Vehicule Vehicule : v) {
			Vehicule.stationner();
			Vehicule.afficher();
		}
		//d
		System.out.println("Vehicules de type Voiteure:");
		for (Vehicule Vehicule : v) {
			if(Vehicule instanceof Voiteur) {
				Vehicule.stationner();
				Vehicule.afficher();
			}
		}
		//e
		Vehicule x = new Moto("11C22","Yamaha",true);
		Voiteur v1 = (Voiteur) x;
		System.out.println("Downcasting reusssi!");
		
		
		/*
		 * Vehicule x = new Moto("11C22","Yamaha",true); Moto v1 = (Moto) x;
		 * System.out.println("Downcasting reusssi!");
		 */


	}

}
