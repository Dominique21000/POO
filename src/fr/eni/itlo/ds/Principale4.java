package fr.eni.itlo.ds;

import java.util.ArrayList;
import java.util.List;

import fr.eni.itlo.ds.parc.Moto;
import fr.eni.itlo.ds.parc.Vehicule;
import fr.eni.itlo.ds.parc.Velo;
import fr.eni.itlo.ds.parc.Voiture;

public class Principale4 {

	public static void main(String[] args) {
		
		List<Vehicule> parc = new ArrayList<>();
		
		parc.add(new Voiture(50,200,28,50));
		parc.add(new Velo(12, 50, "VTT"));
		parc.add(new Moto(120, 250, 1400));
		
		System.out.println("Taille du parc : " + parc.size());
		
		Vehicule veh = parc.get(1);
		System.out.println("Vitesse : " + veh.getVitesse());
	}

}
