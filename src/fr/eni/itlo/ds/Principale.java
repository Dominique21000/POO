package fr.eni.itlo.ds;

import fr.eni.itlo.ds.parc.Vehicule;

public class Principale {

	public static void main(String[] args) {
		Vehicule veh1 = new Vehicule(50,180);
		
		System.out.println("Vitesse : "+ veh1.getVitesse());
		System.out.println("Vitesse maxi : "+ veh1.getVitesseMaximum());
		
		veh1.accelerer();
		
		System.out.println("Vitesse : "+ veh1.getVitesse());
		System.out.println("Vitesse maxi : "+ veh1.getVitesseMaximum());
	}
}