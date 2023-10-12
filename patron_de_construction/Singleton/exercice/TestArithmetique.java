package patron_de_construction.Singleton.exercice;

public class TestArithmetique {
    public static void main(String[] args) {
        int som =Arithmetique.getInstance().somme(2, 5);
        System.out.printf("La somme est %d",som);
        
        Arithmetique a1 = Arithmetique.getInstance(8, 3);
        a1.affiche();

        Arithmetique a2 = Arithmetique.getInstance(5, 9);
        a2.affiche();

        Arithmetique a3 = Arithmetique.getInstance(8, 3,"arithmetique");
        a3.affiche();
        
    }
}