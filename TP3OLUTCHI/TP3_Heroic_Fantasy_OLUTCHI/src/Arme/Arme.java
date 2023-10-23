/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arme;

/**
 *
 * @author PC
 */


    
    

    public class Arme {
        String nom;
        int Attaque ;
        
        public Arme (String Nom ,int niveau ){
         nom=Nom ;
         Attaque= niveau;
         
                 
        }
        
    

   
    @Override
    public String toString() {
        return "LaclasseArme{" + "nom=" + nom + ", niveau=" + Attaque+ '}';
    }
    }



