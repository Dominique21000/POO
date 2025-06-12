package fr.eni.itlo.ds.parc;

public class Moto extends Vehicule implements Vidangeable {

	private int cylindree;

	public Moto(int vitesse, int vitesseMaximum, int cylindree) {
		super(vitesse, vitesseMaximum);
		this.cylindree = cylindree;
	}

	public int getCylindree() {
		return cylindree;
	}

	@Override
	public void faireLaVidange() {
		System.out.println("Vidange de la moto en cours");
	}
}