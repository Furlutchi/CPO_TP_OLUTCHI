/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_olutchi_version_console;

import java.util.Random;

/**
 *
 * @author PC
 */
import java.util.Random;

public class GrilleDeCellules{

    CelluleLumineuse[][] matriceCellules;
    int nbLignes;
    int nbColonnes;

    public GrilleDeCellules(int p_nbLignes, int p_nbColonnes) {
        this.nbLignes = p_nbLignes;
        this.nbColonnes = p_nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    public CelluleLumineuse[][] eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
        return matriceCellules;
    }

    public CelluleLumineuse[][] activerLigneColonneouDiagonaleAleatoire() {
        Random rd = new Random();
        int c = rd.nextInt(3);
        if (c == 0) {
            int l = rd.nextInt(nbLignes);
            for (int i = 0; i < nbColonnes; i++) {
                matriceCellules[l][i].activerCellule();
            }
        }
        if (c == 1) {
            int d = rd.nextInt(nbColonnes);
            for (int i = 0; i < nbLignes; i++) {
                matriceCellules[i][d].activerCellule();
            }
        }
        if (c == 2) {
            for (int i = 0; i < nbLignes; i++) {
                        matriceCellules[i][i].activerCellule();
            }
        }
            if (c == 3) {
                for (int i = 0; i<nbLignes; i++){
                    matriceCellules[i][(nbLignes-i)].activerCellule();
                }
            }
                return matriceCellules;
        }
    public void melangerMatriceAleatoirement( int nbTours){
        this.eteindreToutesLesCellules();
        for (int i=0; i<nbTours; i++){
            this.activerLigneColonneouDiagonaleAleatoire();
        }
    }

    public void activerLigneDeCellules(int idLigne){
        for (int i = 0; i < nbColonnes; i++) {
                matriceCellules[idLigne][i].activerCellule();
        }
    }
    public void activerColonneDeCellules(int idColonne){
        for (int i = 0; i < nbLignes; i++) {
                matriceCellules[i][idColonne].activerCellule();
        }
    }
    public void activerDiagonaleDescendante(){
        for (int i = 0; i < nbLignes; i++) {
                        matriceCellules[i][i].activerCellule();
                    }
                }
    public void activerDiagonaleMontante(){
        for (int i = 0; i<nbLignes; i++){
                    matriceCellules[i][(nbLignes-i)].activerCellule();
                }
    }
    public boolean cellulesToutesEteintes(){
         int k=0;
         boolean x = false;
         for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (matriceCellules[i][j].estEteint() == false){
                    k+=1;
                }
                else{
                    k=k;
                }
            }
    }
        if (k == 0){
            x = true;
        }
        if (k > 0){
            x = false;
        }
        return x;
    }
    
    @Override
    public String toString() {
        //créer des string que j'ajoute pour retourner la valeur 
        String a="";
        String b=""; 
        String c="";
        for (int j=0; j<nbColonnes; j++){
            a += j+" | ";
        }
        for (int j=0; j<=nbColonnes; j++){
                c+="----";
            }
        for (int i=0; i<nbLignes; i++){
            b += "\n"+c+"\n "+i+" | ";
            for (int j=0; j<nbColonnes; j++){
                b += this.matriceCellules[i][j]+" | ";
            }
        }
        return "   | "+a+b;
    }
}
