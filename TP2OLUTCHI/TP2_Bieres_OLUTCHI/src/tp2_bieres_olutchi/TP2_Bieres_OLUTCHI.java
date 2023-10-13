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
        //TODO code application logic here
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",
                7.0, "Dubuisson");
        uneBiere.lireEtiquette();

        BouteilleBiere oluBiere = new BouteilleBiere("leffe",
                6.6, "Abaye Leffe");
        oluBiere.lireEtiquette();

        BouteilleBiere Fallou = new BouteilleBiere("Monster",
                6.5, "Coca Cola");
        Fallou.lireEtiquette();

        BouteilleBiere booster = new BouteilleBiere("Zombie",
                6.4, "TOP");
        booster.lireEtiquette();

        BouteilleBiere indomi = new BouteilleBiere("pate",
                6.3, "Naija");
        indomi.lireEtiquette(); 
        
        System.out.println(uneBiere) ;

    }

}
