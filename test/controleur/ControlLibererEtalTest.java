package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ControlLibererEtalTest {
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
    private ControlLibererEtal controlLibererEtal;

	@Test
	void testControlLibererEtal() {
		controlTrouverEtalVendeur = new ControlTrouverEtalVendeur(null);
        controlLibererEtal = new ControlLibererEtal(controlTrouverEtalVendeur);
	}

	@Test
	void testIsVendeur() {
		controlTrouverEtalVendeur = new ControlTrouverEtalVendeur(null);
	    controlLibererEtal = new ControlLibererEtal(controlTrouverEtalVendeur);

	    String nomVendeurExistant = "Vendeur 1";
	    assertTrue(controlLibererEtal.isVendeur(nomVendeurExistant));

	    String nomVendeurInnexistant = "Vendeur inexistant";
	    assertFalse(controlLibererEtal.isVendeur(nomVendeurInnexistant));
		
	}

	@Test
	void testLibererEtal() {
		controlTrouverEtalVendeur = new ControlTrouverEtalVendeur(null);
        controlLibererEtal = new ControlLibererEtal(controlTrouverEtalVendeur);

        String nomVendeurExistant = "Vendeur 1";
        String[] etatEtalAvantLiberation = controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeurExistant).etatEtal();
	}

}
