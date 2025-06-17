package fr.eni.itlo.ds.parc;

import fr.eni.itlo.ds.exceptions.VehiculeException;

public class Vehicule {

	private int vitesse;
	private int vitesseMaximum;
	
	public Vehicule(){	}
		
	
	public Vehicule(int vitesse, int vitesseMaximum) {
		this.vitesse = vitesse;
		this.vitesseMaximum = vitesseMaximum;
	}

	public void accelerer() throws VehiculeException{
		if (vitesse < vitesseMaximum) {
			vitesse++;
		}
		else {
			throw new VehiculeException("Vitesse maximum atteinte !");
		}
	}
	
	public void freiner() {
		if (vitesse > 0) {
			vitesse--;
		}
	}

	public int getVitesse() {
		return vitesse;
	}

	public int getVitesseMaximum() {
		return vitesseMaximum;
	}	
}
