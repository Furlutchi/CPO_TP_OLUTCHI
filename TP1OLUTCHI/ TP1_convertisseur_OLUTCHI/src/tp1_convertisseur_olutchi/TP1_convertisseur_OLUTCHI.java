/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_olutchi;

import java.util.Scanner;

/**
 * : TP1_ OLUTCHI_convertisseur_
 *
 * @author PC
 */
public class TP1_convertisseur_OLUTCHI {
    public static void main(String[] args) {
        // Créez un objet Scanner pour la saisie de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demandez à l'utilisateur de choisir la conversion
        System.out.println("Choisissez la conversion :");
        System.out.println("1. Celsius vers Kelvin");
        System.out.println("2. Kelvin vers Celsius");
        System.out.println("3. Fahrenheit vers Celsius");
        System.out.print("Votre choix (1, 2 ou 3) : ");
        
        int choix = scanner.nextInt();
        double temperature = 0.0;

        if (choix == 1) {
            // Demandez à l'utilisateur de saisir une valeur réelle en degrés Celsius
            System.out.print("Veuillez saisir une température en degrés Celsius : ");
            temperature = scanner.nextDouble();

            // Appelez la méthode pour convertir la température en degrés Kelvin
            double temperatureKelvin = CelsiusVersKelvin(temperature);

            // Affichez la température en degrés Kelvin
            System.out.println("La température en degrés Kelvin est : " + temperatureKelvin);
        } else if (choix == 2) {
            // Demandez à l'utilisateur de saisir une valeur réelle en degrés Kelvin
            System.out.print("Veuillez saisir une température en degrés Kelvin : ");
            temperature = scanner.nextDouble();

            // Appelez la méthode pour convertir la température en degrés Celsius
            double temperatureCelsius = KelvinVersCelsius(temperature);

            // Affichez la température en degrés Celsius
            System.out.println("La température en degrés Celsius est : " + temperatureCelsius);
        } else if (choix == 3) {
            // Demandez à l'utilisateur de saisir une valeur réelle en degrés Fahrenheit
            System.out.print("Veuillez saisir une température en degrés Fahrenheit : ");
            temperature = scanner.nextDouble();

            // Appelez la méthode pour convertir la température en degrés Celsius
            double temperatureCelsius = FahrenheitVersCelsius(temperature);

            // Affichez la température en degrés Celsius
            System.out.println("La température en degrés Celsius est : " + temperatureCelsius);
        } else {
            System.out.println("Choix invalide.");
        }

        // N'oubliez pas de fermer le scanner pour éviter les fuites de ressources
        scanner.close();
    }

    // Méthode pour convertir la température de Celsius en Kelvin
    public static double CelsiusVersKelvin(double temperatureCelsius) {
        // Utilisez la formule de conversion
        double temperatureKelvin = temperatureCelsius + 273.15;
        return temperatureKelvin;
    }

    // Méthode pour convertir la température de Kelvin en Celsius
    public static double KelvinVersCelsius(double temperatureKelvin) {
        // Utilisez la formule de conversion inverse
        double temperatureCelsius = temperatureKelvin - 273.15;
        return temperatureCelsius;
    }

    // Méthode pour convertir la température de Fahrenheit en Celsius
    public static double FahrenheitVersCelsius(double temperatureFahrenheit) {
        // Utilisez la formule de conversion
        double temperatureCelsius = (temperatureFahrenheit - 32) * 5/9;
        return temperatureCelsius;
    }
}


