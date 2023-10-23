/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arme;

/**
 *
 * @author PC
 */
public class Epee extends Arme {

    int finesse;

    public Epee(String Nom, int niveau, int Finesse) {
        super(Nom, niveau);

        if (finesse > 100) {
            finesse = 100;
        }
        if (finesse < 0) {
            finesse = 0;
        }

    }

}
