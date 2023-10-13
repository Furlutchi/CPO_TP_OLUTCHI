/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_olutchi;

/**
 *
 * @author PC
 */
public class Convertisseur {

    public void Convertisseur() {
        nbConversions = 0;
    }

    int nbConversions;

    public  double CelsiusVersKelvin(double temperatureCelsius) {
        double temperatureKelvin = temperatureCelsius + 273.15;
        return temperatureKelvin;
    }

    public  double KelvinVersCelsius(double temperatureKelvin) {
        double temperatureCelsius = temperatureKelvin - 273.15;
        return temperatureCelsius;
    }

    public  double FahrenheitVersCelsius(double temperatureFahrenheit) {
        double temperatureCelsius = (temperatureFahrenheit - 32) * 5 / 9;
        return temperatureCelsius;
    }

    @Override
    public String toString() {
        return "nb de conversions" + nbConversions;
    }
}
