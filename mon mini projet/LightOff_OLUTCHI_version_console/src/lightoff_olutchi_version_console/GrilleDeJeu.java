/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_olutchi_version_console;

/**
 *
 * @author PC
 */
public class GrilleDeJeu {
    CelluleLumineuse [][] matricecellule;
    int nbLignes;
    int nbColonnes;

    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        matricecellule = new CelluleLumineuse[p_nbLignes][p_nbColonnes];
        this.nbLignes = p_nbLignes;
        this.nbColonnes = p_nbColonnes;
        for (int i=0;i<20;i++){
            for(int j=0;j<20;j++){
              matricecellule[i][j] =new CelluleLumineuse();
            }
        }
        
    }
    
    

}
