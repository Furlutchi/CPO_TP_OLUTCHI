/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_olutchi_version_console;

/**
 *
 * @author PC
 */
public class LightOff_OLUTCHI_version_console {

    public static void main(String[] args) {
        GrilleDeCellules grille = new GrilleDeCellules(7,7);
        Partie partie = new Partie(grille);
        partie.initialiserPartie();
        partie.lancerPartie();

    }

}

