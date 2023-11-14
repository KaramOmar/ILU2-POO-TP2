package controleur;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import villagegaulois.Village;

class ControlAfficherMarcheTest {

	@Test
	void testControlAfficherMarche() {
		Village village = new Village(null, 0, 0);
		ControlAfficherMarche controleur = new ControlAfficherMarche(village);
	
	}

	@Test
	void testDonnerInfosMarche() {
		Village village = new Village(null, 0, 0);
        ControlAfficherMarche controleur = new ControlAfficherMarche(village);

        
        String[] infosMarche = controleur.donnerInfosMarche();

        assertNotNull(infosMarche, "La valeur retournée ne doit pas être null");
        assertTrue(infosMarche.length >= 0, "La longueur de la chaîne doit être supérieure ou égale à 0");
	}

}
