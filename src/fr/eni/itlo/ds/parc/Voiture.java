package fr.eni.itlo.ds.parc;

import fr.eni.itlo.ds.exceptions.VehiculeException;

public class Voiture extends Vehicule implements Vidangeable{

	private int quantiteCarburant;
	private int quantiteCarburantMaximum;
	
	public Voiture(int vitesse, int vitesseMaximum, int quantiteCarburant, int quantiteCarburantMaximum) {
		super(vitesse, vitesseMaximum);
		this.quantiteCarburant = quantiteCarburant;
		this.quantiteCarburantMaximum = quantiteCarburantMaximum;
	}

	public int getQuantiteCarburant() {
		return quantiteCarburant;
	}

	public void setQuantiteCarburant(int quantiteCarburant) {
		this.quantiteCarburant = quantiteCarburant;
	}

	public int getQuantiteCarburantMaximum() {
		return quantiteCarburantMaximum;
	}

	public void setQuantiteCarburantMaximum(int quantiteCarburantMaximum) {
		this.quantiteCarburantMaximum = quantiteCarburantMaximum;
	}
	
	public void accelerer() throws VehiculeException {
		if (quantiteCarburant > 0) {
			super.accelerer();
			quantiteCarburant--;
		}
		else {
			throw new VehiculeException("Plus de carburant."); 
		}
	}

	@Override
	public void faireLaVidange() {
		System.out.println("Vidange de la voiture en cours...");		
	}
}