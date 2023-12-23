package threes;
/**
 *
 *
 */
import static java.awt.event.KeyEvent.VK_DOWN;
import static java.awt.event.KeyEvent.VK_LEFT;
import static java.awt.event.KeyEvent.VK_RIGHT;
import static java.awt.event.KeyEvent.VK_UP;
import static java.awt.event.KeyEvent.VK_R;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class KeyPressFile extends KeyAdapter{

	// hashmap contenant des clés et des méthodes
    private static final HashMap<Integer, Method> keyMapping = new HashMap<>();
    // clés
    private static Integer[] KEYS = { VK_UP, VK_DOWN, VK_LEFT, VK_RIGHT, VK_R };
    // méthodes de grid.java
    private static String[] methodName = { "up", "down", "left", "right", "initializeTiles" };
    private static GRILLE board;
    private static final KeyPressFile INSTANCE = new KeyPressFile();
    
    private KeyPressFile() {
        initKey(KEYS);
    }
    
    public static KeyPressFile getKeyPress(GRILLE g) {
        board = g;
        return INSTANCE;
    }

    // initialiser les clés
    void initKey(Integer[] kcs) {
        for (int i = 0; i < kcs.length; i++) {
            try {
            	//  l'intégrer dans la cartographie des clés
                keyMapping.put(kcs[i], GRILLE.class.getMethod(methodName[i]));
            } catch (NoSuchMethodException | SecurityException e) {
            	// rattraper une exception
                e.printStackTrace();
            }
        }
    }

    // à l'appui d'une touche, faire les choses suivantes
    public void keyPressed(KeyEvent k) {
        super.keyPressed(k);
        Method action = keyMapping.get(k.getKeyCode());
        if (action == null) {
            System.gc();
            return;
        }
        try {
            action.invoke(board);
            board.repaint();
        } catch (InvocationTargetException | IllegalAccessException
                | IllegalArgumentException e) {
            e.printStackTrace();
        }
     
        if (!board.checkIfCanMove()) {
            board.host.lose();
        }

    }

}
