package lightoff_olutchi_version_console;


import java.awt.Color;
import java.awt.Graphics;


import javax.swing.JButton;
import lightoff_olutchi_version_console.CelluleLumineuse;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class CelluleGraphique extends JButton {
     CelluleLumineuse celluleLumineuseAssociee;
     int largeur;
     int  longueur;

    public CelluleGraphique(CelluleLumineuse celluleLumineuseAssociee, int largeur, int longueur) {
        this.celluleLumineuseAssociee = celluleLumineuseAssociee;
        this.largeur = largeur;
        this.longueur = longueur;
    }
    @Override
    protected void paintComponent(Graphics g) {
       
int w = this.getWidth();
 int h = this.getHeight();
 if (celluleLumineuseAssociee.estEteint() == true) {
 g.setColor(Color.red);
 } else {
 g.setColor(Color.yellow);
 }
 g.fillOval(2, 2, w - 4, h - 4);
 }


    }
          
  

