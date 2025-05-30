package fr.eni.itlo.ds;

public class Vehicule {

	private int vitesse;
	private int vitesseMaximum;
	
	public Vehicule(){	}
		
	
	public Vehicule(int vitesse, int vitesseMaximum) {
		this.vitesse = vitesse;
		this.vitesseMaximum = vitesseMaximum;
	}

	public void accelerer() {
		if (vitesse < vitesseMaximum) {
			vitesse++;
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
