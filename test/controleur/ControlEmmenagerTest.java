package controleur;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlEmmenagerTest {
	private Village village; 
	private Chef abraracourcix;
	ControlEmmenager controlEmmenager; 
	
	@BeforeEach
	public void avantTest() {
		village = new Village("le village des irredectibles",10,5);
		Chef abraracourcix=new Chef("abraracourcix",10,village);
		village.setChef(abraracourcix);
		controlEmmenager= new ControlEmmenager(village);
	}
	
	
	@Test
	void testControlEmmenager() {
		controlEmmenager = new ControlEmmenager(village);
		assertNotNull(controlEmmenager,"Constructeur ne renvoie pas null");
	}

	@Test
	void testIsHabitant() {
		controlEmmenager = new ControlEmmenager(village);
		controlEmmenager.ajouterGaulois("Bonemine",10);
		assertTrue(controlEmmenager.isHabitant("Bonemine"));
		assertFalse(controlEmmenager.isHabitant("existe pas"));
		controlEmmenager.ajouterDruide("Panoramix",10,1,5);
		assertTrue(controlEmmenager.isHabitant("Panoramix"));
	}

	@Test
	void testAjouterDruide() {
		controlEmmenager = new ControlEmmenager(village);
		controlEmmenager.ajouterDruide("Panoramix",10,1,5);
	}

	@Test
	void testAjouterGaulois() {
		ControlEmmenager controlEmmenager = new ControlEmmenager(village);
		controlEmmenager.ajouterGaulois("Bonemine",10);
	}

}
