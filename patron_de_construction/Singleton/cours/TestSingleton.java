package patron_de_construction.Singleton.cours;

public class TestSingleton {
    public static void main(String[] args) {
        int som =Singleton.getInstance().somme(2, 5);
        System.out.printf("La somme est %d",som);
        
        Singleton a1 = Singleton.getInstance(8, 3);
        a1.affiche();

        Singleton a2 = Singleton.getInstance(5, 9);
        a2.affiche();

        
    }
}
