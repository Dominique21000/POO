package fr.eni.itlo.ds;

import fr.eni.itlo.ds.parc.Moto;
import fr.eni.itlo.ds.parc.Vehicule;
import fr.eni.itlo.ds.parc.Velo;
import fr.eni.itlo.ds.parc.Vidangeable;
import fr.eni.itlo.ds.parc.Voiture;

public class Principale3 {

	public static void main(String[] args) {
		Voiture voit1 = new Voiture(50,180,28, 50);
		Moto moto1 = new Moto(75, 250, 1400);
		Velo velo1 = new Velo(12,50,"VTT");
		
		Vehicule[] parc = { voit1, moto1, velo1 }; 

		for (Vehicule v : parc) {
			/*if (v instanceof Vidangeable ) {
				((Vidangeable) v).faireLaVidange();
			}
			*/
			if (v instanceof Vidangeable vid) {
				vid.faireLaVidange();
			}
		}
	}
}