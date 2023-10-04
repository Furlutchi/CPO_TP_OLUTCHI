/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_oluitchi;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class TP1_stats_OLUITCHI {
   public static void main(String[] args) {
        // Créez un tableau de 6 entiers, initialisés à 0
        int[] tableauDe = new int[6];

        // Créez un objet Scanner pour la saisie de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demandez à l'utilisateur de saisir un nombre entier m
        System.out.print("Veuillez saisir un nombre entier m : ");
        int m = scanner.nextInt();

        // Créez un objet Random pour générer des nombres aléatoires
        Random random = new Random();

        // Effectuez m itérations pour simuler le lancer du dé
        for (int i = 0; i < m; i++) {
            int resultatLancer = random.nextInt(6); // Génère un nombre aléatoire entre 0 et 5
            tableauDe[resultatLancer]++; // Incrémente la case correspondante dans le tableau
        }

        // Affichez le tableau résultat
        System.out.println("Résultats des lancers :");
        for (int i = 0; i < tableauDe.length; i++) {
            System.out.println("Face " + (i + 1) + " : " + tableauDe[i] + " fois");
        }

        
    }
}

    
    

