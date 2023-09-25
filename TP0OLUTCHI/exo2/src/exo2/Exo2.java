/*
 *TPO OLUTCHI EX0 2
 * mrg
 * septembre 2023
 */
package exo2;

/**
 *
 * @author PC
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaration des variables 
        int nb;
        int result;
        int ind;
        nb=5;
        result=0;
        // Addition des nb premiers entiers 
        ind=1;
         while (ind<= nb) {
             result=result+ind;
         }
         // Affichage du resultat 
         System.out.println();
         System.out.println("La somme des "+ nb + "entiers est: "+result);
    }
    
}
