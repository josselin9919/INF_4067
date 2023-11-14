package patrons_de_structuration.patron_Composite.Exemple;

import java.util.ArrayList;

public class Section implements Texte{
    protected ArrayList<Texte> sousSection = new ArrayList<Texte>();
    public int longueur() {
        int i=0;
       for (Texte child: sousSection)
       {
            i=+child.longueur();
       }
       return i;
    }
    public void ajout(Texte txt){
        this.sousSection.add(txt);
    }
    public void retrait(int index){
        this.sousSection.remove(index);
    }
}
