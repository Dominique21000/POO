package fr.eni.itlo.ds;

import fr.eni.itlo.ds.exceptions.VehiculeException;
import fr.eni.itlo.ds.parc.Voiture;

public class Principale2 {

	public static void main(String[] args) {
		Voiture voit1 = new Voiture(50,180,1,50);
		
		try {
			voit1.accelerer();
			voit1.accelerer();
			voit1.accelerer();
			voit1.accelerer();
			voit1.accelerer();
			voit1.accelerer();
		} 
		catch (VehiculeException e) {
			System.err.println("Erreur : " + e.getMessage());
		}
		
		System.out.println("Vitesse : " + voit1.getVitesse());
		System.out.println("Quantité de carburant : " + voit1.getQuantiteCarburant());
	}
}