/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_olutchi;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class TP2_convertisseurObjet_OLUTCHI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur p = new Convertisseur();
        /*double res = p.CelsiusVersKelvin(45);
        System.out.println(res);
        double res2 = p.KelvinVersCelsius(res);
        System.out.println(res2);*/

        System.out.println("Choisissez la conversion :");
        System.out.println("1. Celsius vers Kelvin");
        System.out.println("2. Kelvin vers Celsius");
        System.out.println("3. Fahrenheit vers Celsius");
        System.out.print("Votre choix (1, 2 ou 3) : ");
         Scanner scanner = new Scanner(System.in);
          int choix = scanner.nextInt();
        double temperature = 0.0;
        p.Convertisseur();
        if (choix == 1) {
            // Demandez à l'utilisateur de saisir une valeur réelle en degrés Celsius
            System.out.print("Veuillez saisir une température en degrés Celsius : ");
            temperature = scanner.nextDouble();
            p.toString();

            // Appelez la méthode pour convertir la température en degrés Kelvin
            double temperatureKelvin = p.CelsiusVersKelvin(temperature);

            // Affichez la température en degrés Kelvin
            System.out.println("La température en degrés Kelvin est : " + temperatureKelvin);
        } else if (choix == 2) {
            // Demandez à l'utilisateur de saisir une valeur réelle en degrés Kelvin
            System.out.print("Veuillez saisir une température en degrés Kelvin : ");
            temperature = scanner.nextDouble();
            p.toString();

            // Appelez la méthode pour convertir la température en degrés Celsius
            double temperatureCelsius = p.KelvinVersCelsius(temperature);

            // Affichez la température en degrés Celsius
            System.out.println("La température en degrés Celsius est : " + temperatureCelsius);
        } else if (choix == 3) {
            // Demandez à l'utilisateur de saisir une valeur réelle en degrés Fahrenheit
            System.out.print("Veuillez saisir une température en degrés Fahrenheit : ");
            temperature = scanner.nextDouble();
            p.toString();

            // Appelez la méthode pour convertir la température en degrés Celsius
            double temperatureCelsius = p.FahrenheitVersCelsius(temperature);

            // Affichez la température en degrés Celsius
            System.out.println("La température en degrés Celsius est : " + temperatureCelsius);
        } else {
            System.out.println("Choix invalide.");
        }

        
    }
    


        
}
