/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_olutchi_version_console;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Partie {
    GrilleDeCellules grille;
    int nbCoups;

    public Partie(GrilleDeCellules grille) {
        this.grille = grille;
        
    }

   public void initialiserPartie(){
        int nbCoup = 7;
        grille.melangerMatriceAleatoirement( nbCoup);
    }
public void lancerPartie(){
    Scanner sc = new Scanner(System.in);
    System.out.println(grille);
    while(!grille.cellulesToutesEteintes()){
        System.out.println("Veuillez saisir:\n"+ "1)Activer Ligne\n" + "2)Activer Colonne\n" + "3)Activer Diagonale descendante\n" + "4)Activer Diagonale montante");
        int Coup = sc.nextInt();
        nbCoups ++;
        if (Coup == 1){
            System.out.println("Quels lignes?");
            int ligne = sc.nextInt();
            grille.activerLigneDeCellules(ligne);
        }
        if (Coup == 2){
            System.out.println("Quels colonnes?");
            int colonne = sc.nextInt();
            grille.activerColonneDeCellules(colonne);
        }
        if (Coup == 3){
            grille.activerDiagonaleDescendante();
        }
        if (Coup == 4){
            grille.activerDiagonaleMontante();
        }
        System.out.println(grille);
    }
    System.out.println("Felicitations vous avez gagné le jeu en "+nbCoups+" coups");
}
}

