package threes;
/**
 *
 * 
 */
import java.awt.*;
import java.util.*;
import java.util.List;
import javax.swing.*;

public class GRILLE extends JPanel{
	// serialVersionUID pour supprimer l'avertissement
	private static final long serialVersionUID = 1L;
	// nombre de lignes
	public static final int ROW = 4;
	// définir le principal comme hôte
    final GameRun host;
    
    // tableau de carreaux utilisés pour dessiner la grille
    private TilesFile[] tiles;
    // définir l'objectif comme une valeur de 2048 à partir du fichier Nombreetcouleur
    public static Nombreetcouleur goal = Nombreetcouleur._2048;

    private static final Color BG_COLOR = new Color(0x87CEEB);
    //définir la police de caractères des chiffres, la taille et le style de police peuvent être modifiés ici
    private static final Font STR_FONT = new Font(Font.SERIF, Font.BOLD, 16);
    private static final int SIDE = 64;
    private static final int MARGIN = 16;
    
    // constructEUR 
    public GRILLE (GameRun main){
    	host = main;
    	setFocusable(true);
    	initializeTiles();
    }
    
    // addNewTile trouve un endroit aléatoire sur la grille qui est vide et y initialise une nouvelle tuile aléatoire
    private void addNewTile(){
    	// liste de toutes les tuiles vides
    	List<Integer> list = findEmptyIndex();
    	// choisir au hasard dans la liste
    	int index = list.get((int) (Math.random() * list.size()));
    	tiles[index] = TilesFile.randomTile();
    }
    
    // initializeTiles configure le tableau lors de la première exécution, en mettant toutes les tuiles à 0 puis en ajoutant deux nouvelles tuiles
    //sert également à réinitialiser la carte    
    public void initializeTiles() {
        tiles = new TilesFile[ROW * ROW];
        // mettre toutes les tuiles à 0
        for (int i = 0; i < tiles.length; i++) {
            tiles[i] = TilesFile.ZERO;
        }
        // ajouter deux tuiles pour commencer
        addNewTile();
        addNewTile();
        host.statusBar.setText("");
    }
    
    // findEmptyIndex renvoie une liste de carreaux vides
    private List<Integer> findEmptyIndex() {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < tiles.length; i++) {
            if (tiles[i].empty())
                list.add(i);
        }
        return list;
    }
    
    // vérifier que la grille est pleine (c'est-à-dire qu'il n'y a pas de tuiles vides)
    private boolean isGridFull() {
        return findEmptyIndex().size() == 0;
    }
	
    // retourner la tuile à x, y, où x est la colonne et y est la ligne, grille montrée ci-dessous pour aider à la visualisation
    // [0]  [1]  [2]  [3]
    // [4]  [5]  [6]  [7]
    // [8]  [9]  [10] [11]
    // [12] [13] [14] [15]
    // 1,0 would be [1], 1,1 would be [5], 2,1 would be [6], etc.
    private TilesFile tileAt(int x, int y) {
        return tiles[x + y * ROW];
    }
    
    // checkIfCanMove vérifie si des tuiles bloquent une certaine direction
    boolean checkIfCanMove() {
        if (!isGridFull()) {
            return true;
        }
        for (int x = 0; x < 4; x++){
        	for (int y = 0; y < 4; y++){
                TilesFile t = tileAt(x, y);
                if ((x < ROW - 1 && t.equals(tileAt(x + 1, y))) || (y < ROW - 1 && t.equals(tileAt(x, y + 1)))) {
                    return true;
                }
            }
        }
        return false;
    }
    
    // rotate renvoie un tableau de tuiles qui est tourné de la valeur indiquée.
    
    private TilesFile[] rotate(int degree) {
        TilesFile[] newTiles = new TilesFile[ROW * ROW];
        int offsetX = 3, offsetY = 3;
        if (degree == 90) {
            offsetY = 0;
        } else if (degree == 180) {
        } else if (degree == 270) {
            offsetX = 0;
        }
        double radians = Math.toRadians(degree);
        int cos = (int) Math.cos(radians);
        int sin = (int) Math.sin(radians);
        for (int x = 0; x < 4; x++){
        	for (int y = 0; y < 4; y++){
                int newX = (x * cos) - (y * sin) + offsetX;
                int newY = (x * sin) + (y * cos) + offsetY;
                newTiles[(newX) + (newY) * ROW] = tileAt(x, y);
            }
        }
        return newTiles;
    }
    
    // les 5 fonctions suivantes sont des fonctions utilisées pour faciliter l'écriture du code directionnel
    //  getLine renvoie la ligne sélectionnée sous forme de tableau
    private TilesFile[] getLine(int index) {
        TilesFile[] result = new TilesFile[4];
        for (int i = 0; i < 4; i++){
            result[i] = tileAt(i, index);
        }
        return result;
    }
    
    // s'assure que la taille est correcte, ajoute des 0 si ce n'est pas le cas, comme lorsque l'on change de place.
    // les carreaux, il ne reste plus que des espaces vides
    private static void ensureSize(List<TilesFile> l, int s) {
        while (l.size() < s) {
            l.add(TilesFile.ZERO);
        }
    }
    
    // déplacer les lignes, renvoyer une nouvelle ligne
    private TilesFile[] moveLine(TilesFile[] oldLine) {
        LinkedList<TilesFile> l = new LinkedList<>();
        for (int i = 0; i < 4; i++){
            if (!oldLine[i].empty())
                l.addLast(oldLine[i]);
        }
        if (l.size() == 0) {
            return oldLine;
        } else {
            TilesFile[] newLine = new TilesFile[4];
            ensureSize(l, 4);
            for (int i = 0; i < 4; i++){
                newLine[i] = l.removeFirst();
            }
            return newLine;
        }
    }
    
    // fusionne les lignes
    private TilesFile[] mergeLine(TilesFile[] oldLine) {
        LinkedList<TilesFile> list = new LinkedList<TilesFile>();
        for (int i = 0; i < ROW; i++) {
            if (i < ROW - 1 && !oldLine[i].empty()
                    && oldLine[i].equals(oldLine[i + 1])) {
                TilesFile merged = oldLine[i].getDouble();
                i++;
                list.add(merged);
                if (merged.value() == goal) {
                    host.win();
                }
            } else {
                list.add(oldLine[i]);
            }
        }
        ensureSize(list, 4);
        return list.toArray(new TilesFile[4]);
    }
    
    // fixer la ligne
    private void setLine(int index, TilesFile[] re) {
    	for (int i = 0; i < 4; i++){
            tiles[i + index * ROW] = re[i];
        }
    }
    
    // utiliser getLine, moveLine, mergeLine, setLine pour déplacer tout vers la gauche et fusionner en conséquence
    public void left(){
        boolean needAddTile = false;
        for (int i = 0; i < 4; i++){
            TilesFile[] origin = getLine(i);
            TilesFile[] afterMove = moveLine(origin);
            TilesFile[] merged = mergeLine(afterMove);
            setLine(i, merged);
            if (!needAddTile && !Arrays.equals(origin, merged)) {
                needAddTile = true;
            }
        }
        if (needAddTile) {
            addNewTile();
        }
    }
  
    // vous faites pivoter le tableau de 180 degrés, vous déplacez tout vers la droite, puis vous faites une rotation de 180 degrés
    // c'est la même chose que de le déplacer vers la droite
    public void right() {
    	
        tiles = rotate(180);
        left();
        tiles = rotate(180);
    }
    // la montée en puissance, même logique que précédemment
    public void up() {
        tiles = rotate(270);
        left();
        tiles = rotate(90);
    }
    // descendre, même logique que précédemment
    public void down() {
        tiles = rotate(90);
        left();
        tiles = rotate(270);
    }
 
    // fonction utilisée pour le dessin
    private static int offsetCoors(int arg) {
        return arg * (MARGIN + SIDE) + MARGIN;
    }
    
    // dessine la tuile
    private void drawTile(Graphics g, TilesFile tile, int x, int y) {
        Nombreetcouleur val = tile.value();
        int xOffset = offsetCoors(x);
        int yOffset = offsetCoors(y);
        g.setColor(val.color());
        g.fillRect(xOffset, yOffset, SIDE, SIDE);
        g.setColor(val.fontColor());
        
        if (val.value() != 0)
            g.drawString(tile.toString(), xOffset
                    + (SIDE >> 1) - MARGIN, yOffset + (SIDE >> 1));
    }
    
    // peint la grille, appelé à chaque fois qu'un événement clé met à jour le tableau
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(BG_COLOR);
        g.setFont(STR_FONT);
        g.fillRect(0, 0, this.getSize().width, this.getSize().height);
        for (int x = 0; x < 4; x++){
        	for (int y = 0; y < 4; y++){
                drawTile(g, tiles[x + y * ROW], x, y);
            }
        }
    }

}
