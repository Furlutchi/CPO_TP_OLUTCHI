/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_olutchi_version_console;

/**
 *
 * @author PC
 */
public class CelluleLumineuse {

    private boolean etat;

    /**
     * mon constructeur qui initialise la variable etat "éteinte" (false)
     */
    public CelluleLumineuse() {
        etat = false;
    }

    /**
     * la method activercellule modifie l'etat de la cellule en son contraire 
     */
    public void activerCellule() {
        etat = etat == false;
    }

    /**
     *la method eteindrecellule eteint la cellule si elle est allumee 
     * et la laisse eteinte si elle est eteint
     */
    public void eteindreCellule() {
        if (etat == true) {
            etat = false;
        } else {
            etat = false;
        }
    }

    /**
     *verifie si la cellule est eteinte 
     * @param etat
     * @return false si la cellule est allume et true si elle est eteint
     */
    public boolean estEteint(boolean etat) {
        return etat == false;
    }

    /**
     *
     * @param etat
     * @return  l'etat de la cellule lumineuse allumer ou eteinte
     */
    public boolean  getEtat(boolean etat){
        return etat==true;
         
     }

    /**
     *
     * @return X si la cellule est allume et O si elle est eteinte
     */
    @Override
    public String toString() {
        if (etat==true){
        return "CelluleLumineuse{" + "etat=" + "X" + '}';
        }else{return "CelluleLumineuse{" + "etat=" + "O" + '}';}
        
    }
     
}
