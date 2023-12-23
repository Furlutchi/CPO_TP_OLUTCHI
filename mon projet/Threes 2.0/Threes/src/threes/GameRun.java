package threes;
/**
 *
 * 
 */
import java.awt.*;

import javax.swing.*;

// classe principale 
public class GameRun extends JFrame {

	private static final long serialVersionUID = 1L;

	JLabel statusBar;
    private static final String titre = "Threes 2.0";
    // massage de victoire et defaite 
    public static final String victoire = "felicitation, un nouvelle essai?";
    public static final String Defaite = "un peu plus de malice voyons,R pour une nouvelle partie";
    
    public static void main(String[] args) {

        GameRun game = new GameRun();
        GRILLE board = new GRILLE(game);
        if (args.length != 0 && args[0].matches("[]*")) {
            GRILLE.goal = Nombreetcouleur.of(Integer.parseInt(args[0]));
        }
        KeyPressFile kb = KeyPressFile.getKeyPress(board);
        board.addKeyListener(kb);
        game.add(board);
        
        game.setLocationRelativeTo(null);
        game.setVisible(true);
    }

    // constructor
    public GameRun() {
        setTitle(titre);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(340, 400);
        setResizable(false);

        statusBar = new JLabel("");
        add(statusBar, BorderLayout.SOUTH);
    }

    void win() {
        statusBar.setText(victoire);
    }
    void lose() {
        statusBar.setText(Defaite);
    }
}
