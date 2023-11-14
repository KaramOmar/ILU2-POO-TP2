package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import villagegaulois.Village;
import villagegaulois.Etal;
import controleur.ControlPrendreEtal;
import personnages.Chef;
import personnages.Gaulois;
import controleur.ControlVerifierIdentite;
class ControlPrendreEtalTest {
	
	Village village;
	ControlPrendreEtal Controle;
	
	@BeforeEach
	void setUp() throws Exception{
		village = new Village("le village des irredectibles",10,5);
		Chef abraracourcix=new Chef("abraracourcix",10,village);
		village.setChef(abraracourcix);
		ControlVerifierIdentite controlVerifierIdentite= new ControlVerifierIdentite(village);
		Controle = new ControlPrendreEtal(controlVerifierIdentite, village);
		
		
	}
		
	

	@Test
	void testControlPrendreEtal() {
		
		assertNotNull(Controle);
       
    }
        
	
	

	@Test
	void testResteEtals() {
		assertTrue(Controle.resteEtals());
        Controle.prendreEtal("n", "p", 1);
        assertTrue(Controle.resteEtals());
        Controle.prendreEtal("n", "p", 1);
        assertTrue(Controle.resteEtals());
        Controle.prendreEtal("n", "p", 1);
        assertTrue(Controle.resteEtals());
	        
	}

	@Test
	void testPrendreEtal() {
		 testResteEtals();
	}

	@Test
	void testVerifierIdentite() {
		Gaulois gaulois  = new Gaulois("Asterix",3);
		village.ajouterHabitant(gaulois);
		assertFalse(controlVerifierIdentite.verifierIdentite("Obélix"));
}
}