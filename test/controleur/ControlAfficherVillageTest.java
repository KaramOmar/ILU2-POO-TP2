package controleur;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import personnages.Gaulois;
import villagegaulois.Village;

class ControlAfficherVillageTest {
	private Village village;
	
	
	@Test
	void testControlAfficherVillage() {
		Village village = new Village("Mon Village", 10, 5);
		ControlAfficherVillage controlAfficherVillage = new ControlAfficherVillage(village);
		assertEquals("Mon Village", controlAfficherVillage.donnerNomVillage());
		assertEquals(5, controlAfficherVillage.donnerNbEtals());
	}

	
	
		
	@Test
	void testDonnerNomVillage() {
		Village village = new Village("Mon Village", 10, 5);
        ControlAfficherVillage controlAfficherVillage = new ControlAfficherVillage(village);
        assertEquals("Mon Village", controlAfficherVillage.donnerNomVillage());
    }
	

	@Test
	void testDonnerNbEtals() {
		 Village village = new Village("Mon Village", 10, 5);
		 ControlAfficherVillage controlAfficherVillage = new ControlAfficherVillage(village);
		 assertEquals(5, controlAfficherVillage.donnerNbEtals());
	}

}
