package threes;
/**
 *
 * 
 */
import java.awt.*;

// enum pour stocker des valeurs de nombres et de couleurs banales
public enum Nombreetcouleur {
	

   _0(0, 0xcdc0b4, 0x776e65),
    _1(1, 0x776E65, 0xEEE4DA),
    _2(2, 0x87CEEB, 0x776e65), 
    _4(4, 0x87CEEB, 0xEDE0C8),
    _8(8, 0xF9F6F2, 0xF2B179),
    _16(16, 0xF9F6F2, 0xF59563),
    _32(32, 0xF9F6F2, 0xF67C5F),
    _64(64, 0xF9F6F2, 0xF65E3B),
    _128(128, 0xF9F6F2, 0xEDCF72),
    _256(256, 0xF9F6F2, 0xEDCC61),
    _512(512, 0xF9F6F2, 0xEDC850),
    _1024(1024, 0xF9F6F2, 0xEDC53F),
    _2048(2048, 0xF9F6F2, 0xEDC22E);
    
    private final int value;
    private final Color color;
    private final Color fontColor;

    // constructeur 
    Nombreetcouleur(int n, int f, int c) {
        value = n;
        color = new Color(c);
        fontColor = new Color(f);
    }
    
    static Nombreetcouleur of(int num) {
        return Nombreetcouleur.valueOf("_" + num);
    }

    public Color fontColor() {
        return fontColor;
    }

    public Color color() {
        return color;
    }
    
    public int value() {
        return value;
    }
    

}
