package fr.eni.itlo.ds;

public class Vehicule {

	int vitesse;
	int vitesseMaximum;
	
	void accelerer() {
		if (vitesse < vitesseMaximum) {
			vitesse++;
		}
	}
	
	void freiner() {
		if (vitesse > 0) {
			vitesse--;
		}
	}
}
