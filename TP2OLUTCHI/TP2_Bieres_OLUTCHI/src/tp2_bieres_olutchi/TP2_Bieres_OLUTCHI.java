/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_olutchi;

/**
 *
 * @author PC
 */
public class TP2_Bieres_OLUTCHI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BouteilleBiere uneBiere = new BouteilleBiere();
        uneBiere.nom = "Cuvée des trolls";
        uneBiere.degreAlcool = 7.0;
        uneBiere.brasserie = "Dubuisson";
        uneBiere.ouverte = false;
        uneBiere.lireEtiquette();

        BouteilleBiere olubierre = new BouteilleBiere();
        olubierre.nom = "« Leffe";
        olubierre.degreAlcool = 6.6;
        olubierre.brasserie = "Abbaye de Leffe";
        olubierre.ouverte = false;
        olubierre.lireEtiquette();

    }

}
