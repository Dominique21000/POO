package fr.eni.itlo.ds;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.eni.itlo.ds.parc.Moto;
import fr.eni.itlo.ds.parc.Vehicule;
import fr.eni.itlo.ds.parc.Velo;
import fr.eni.itlo.ds.parc.Voiture;

public class Principale4 {

	private static Logger log = LogManager.getLogger(Principale4.class);
	
	public static void main(String[] args) {
		
		log.info("Démarrage de l'application");
		
		List<Vehicule> parc = new ArrayList<>();
		
		parc.add(new Voiture(50,200,28,50));
		parc.add(new Velo(12, 50, "VTT"));
		parc.add(new Moto(120, 250, 1400));
		
		/*
		System.out.println("Taille du parc : " + parc.size());
		
		Vehicule veh = parc.get(1);
		System.out.println("Vitesse : " + veh.getVitesse());
		*/
		
		
		// 4.44 : re créer grâce au stram une collection qui ne contient que les véhicule rapides : vitesse max > 150
		List<Vehicule> vehiculesRapides = parc.stream()
			.filter(v -> v.getVitesseMaximum() > 150 )
			.collect(Collectors.toList());
		
		System.out.println("Nombre de véhicules rapide dans cette collection : " + vehiculesRapides.size());
		log.info("Arrêt de l'application.");
	}
}