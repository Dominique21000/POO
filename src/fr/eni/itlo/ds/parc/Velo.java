package fr.eni.itlo.ds.parc;

public class Velo extends Vehicule {

	private String type;

	public Velo(int vitesse, int vitesseMaximum, String type) {
		super(vitesse, vitesseMaximum);
		this.type = type;
	}

	public String getType() {
		return type;
	}	
}