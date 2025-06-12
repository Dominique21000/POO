package fr.eni.itlo.ds.parc;

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
	
	public void accelerer() {
		if (quantiteCarburant > 0) {
			super.accelerer();
			quantiteCarburant--;
		}		
	}

	@Override
	public void faireLaVidange() {
		System.out.println("Vidange de la voiture en cours...");		
	}
}