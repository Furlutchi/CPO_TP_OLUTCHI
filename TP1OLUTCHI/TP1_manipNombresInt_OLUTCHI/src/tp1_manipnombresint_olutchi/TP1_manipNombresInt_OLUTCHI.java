/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_olutchi;

import java.util.Scanner;

/**
 * TP1 OLUTCHI MANIPNOMBRESINT SEPTEMBRE 2023
 */
public class TP1_manipNombresInt_OLUTCHI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        /* partie 1 :Saisie et manipulation de nombres*/
        Scanner sc = new Scanner(System.in);
        System.out.println("saisir deux entiers a, b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        int e = a - b;
        int f = a * b;
        int g = a / b;
        int h = a % b;
        System.out.println("somme  a+b=" + c);
        System.out.println("difference  a-b=" + e);
        System.out.println("Produit  ab=" + f);
        System.out.println("quotient a/b=" + g + "et le reste=" + h);

//        
    }

}
