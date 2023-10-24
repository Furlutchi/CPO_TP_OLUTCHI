/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_olutchi;

import Arme.*;
 import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class TP3_Heroic_Fantasy_OLUTCHI {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Epee pE = new Epee("Excalibur", 7, 5);
        System.out.println(pE);
        Epee DE = new Epee("Durandal", 4, 7);
        System.out.println(DE );
        Baton pB = new Baton("Chêne", 4, 5);
        System.out.println(pB);
         Baton DB = new Baton( "Charme", 5, 6);
        System.out.println(DB);
        
       //creation du tableauDynamique 
        ArrayList<Arme> TableauDynamique = new ArrayList<Arme>();
        // Ajout de pE,DE,pB,DB
        TableauDynamique.add(pE);
        TableauDynamique.add(DE);
        TableauDynamique.add(pB);
        TableauDynamique.add(DB);
        // Parcourir le TableauDynamique 
 /*  
while (it.hasNext()) {
    String element = it.next();
    System.out.println(element);*/
}

    }
}

