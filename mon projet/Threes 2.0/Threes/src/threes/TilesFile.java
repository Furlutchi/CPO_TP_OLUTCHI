package threes;

import java.util.*;

// titre 
public class TilesFile {
    private final Nombreetcouleur nac;
    private final static HashMap<Integer, TilesFile> cache = new HashMap<>();

    public final static TilesFile ZERO = new TilesFile(Nombreetcouleur._0);
    public final static TilesFile ONE = new TilesFile(Nombreetcouleur._1);  // New constant for 1
    public final static TilesFile TWO = new TilesFile(Nombreetcouleur._2);
    
    // les nombres/valeurs couramment utilisés, 0, 1 et 2, sont placés dans le cache
    static {
        for (Nombreetcouleur n : Nombreetcouleur.values()) {
            switch (n) {
                case _0:
                    cache.put(n.value(), ZERO);
                    break;
                case _1:
                    cache.put(n.value(), ONE);
                    break;
                case _2:
                    cache.put(n.value(), TWO);
                    break;
                default:
                    cache.put(n.value(), new TilesFile(n));
                    break;
            }
        }
    }

    // constructeur
    public TilesFile(Nombreetcouleur n) {
        nac = n;
    }

    Nombreetcouleur value() {
        return nac;
    }

    public static TilesFile valueOf(int num) {
        return cache.get(num);
    }

    public TilesFile getDouble() {
        return valueOf(nac.value() << 1);
    }

    boolean empty() {
        return nac == Nombreetcouleur._0;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof TilesFile))
            return false;
        TilesFile other = (TilesFile) obj;
        if (nac != other.nac)
            return false;
        return true;
    }

    //  randomTile pour déterminer un 4 ou un 2 lors de l'apparition d'une tuile
    static TilesFile randomTile() {
        return Math.random() < 0.15 ? valueOf(2) : valueOf(1);  // Adjust the probabilities for 1 and 2
    }

    public String toString() {
        return String.format("%1$4d", nac.value());
    }
}
