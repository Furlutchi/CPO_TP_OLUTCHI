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
    private boolean etat = false;

    public CelluleLumineuse() {
        this.etat = false;
    }

    public boolean activerCellule() {
        if (etat == true) {
            etat = false;
        } else if (etat == false) {
            etat = true;
        }
        return etat;
    }

    public boolean eteindreCellule() {
        if (etat == true) {
            etat = false;
        }
        return etat;
    }

    public boolean estEteint() {
        if (etat == false) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getEtat() {
        if (etat == true) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String x;
        if (etat == false) {
            x = "O";
        } else {
            x = "X";
        }
        return x;
    }
}
