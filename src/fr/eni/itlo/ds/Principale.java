package fr.eni.itlo.ds;

import fr.eni.itlo.ds.exceptions.VehiculeException;
import fr.eni.itlo.ds.parc.Vehicule;

public class Principale {

	public static void main(String[] args) {
		Vehicule veh1 = new Vehicule(180,180);
		
		System.out.println("Vitesse : "+ veh1.getVitesse());
		System.out.println("Vitesse maxi : "+ veh1.getVitesseMaximum());
		
		try {
			veh1.accelerer();
		} 
		catch (VehiculeException e) {
			System.err.println("Erreur" + e.getMessage());
		}
		
		System.out.println("Vitesse : "+ veh1.getVitesse());
		System.out.println("Vitesse maxi : "+ veh1.getVitesseMaximum());
	}
}