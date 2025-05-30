package fr.eni.itlo.ds;

public class Moto extends Vehicule{

	private int cylindree;

	public Moto(int vitesse, int vitesseMaximum, int cylindree) {
		super(vitesse, vitesseMaximum);
		this.cylindree = cylindree;
	}

	public int getCylindree() {
		return cylindree;
	}
}