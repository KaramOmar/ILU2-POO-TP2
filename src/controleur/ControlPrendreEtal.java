package controleur;

import personnages.Gaulois;
import villagegaulois.Village;

public class ControlPrendreEtal {
    private Village village;
    private ControlVerifierIdentite controlVerifierIdentite;

    public ControlPrendreEtal(ControlVerifierIdentite controlVerifierIdentite, Village village) {
        this.controlVerifierIdentite = controlVerifierIdentite;
        this.village = village;
    }

    public boolean resteEtals() {
        return village.rechercherEtalVide();
    }

    public int prendreEtal(String nomVendeur, String produit, int nbProduit) {
        int numeroEtal = -1;
        if (verifierIdentite(nomVendeur) && resteEtals()) {
            Gaulois vendeur = village.trouverHabitant(nomVendeur);
            numeroEtal = village.installerVendeur(vendeur, produit, nbProduit);

            
            if (numeroEtal != -1) {
                numeroEtal++; 
            }
        }
        return numeroEtal;
    }

    public boolean verifierIdentite(String nomVendeur) {
        return controlVerifierIdentite.verifierIdentite(nomVendeur);
    }
}
