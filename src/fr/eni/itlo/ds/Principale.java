package fr.eni.itlo.ds;

public class Principale {

	public static void main(String[] args) {
		Vehicule veh1 = new Vehicule();
		veh1.vitesse = 50;
		veh1.vitesseMaximum = 180;
		
		veh1.accelerer();
		
		System.out.println("Vitesse : "+ veh1.vitesse);
	}
}