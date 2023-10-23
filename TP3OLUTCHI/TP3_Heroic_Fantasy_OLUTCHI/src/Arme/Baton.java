/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arme;

/**
 *
 * @author PC
 */
public class Baton {

    int âge;

    public Baton(int âge) {
        this.âge = âge;
        if (âge > 100) {
            âge = 100;
        }
        if (âge < 0) {
            âge = 0;
        }
    }

}
