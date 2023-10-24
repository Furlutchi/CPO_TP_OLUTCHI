/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arme;

/**
 *
 * @author PC
 */
public class Baton extends Arme {

    int Age;

    public Baton(String Nom, int niveau ,int Age ) {
        super(Nom, niveau);
        this.Age = Age;
        if (Age > 100) {
            Age = 100;
        }
        if (Age < 0) {
            Age = 0;
        }
    }

}
