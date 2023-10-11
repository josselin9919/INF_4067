package patron_de_construction.Factory.cours.Factory;

public class Client{
    public static void main(String[] args){
        ProduitFactory produitFactory1 =new ProduitFactory1();
        ProduitFactory produitFactory2 =new ProduitFactory2();
        ProduitA produitA = null;

        System.out.println("Utilisation de la premiere fabrique");
        produitA = produitFactory1.getProduitA();
        produitA.methodeA();

        System.out.println("Utilisation de la deuxieme fabrique");

        produitA = produitFactory2.getProduitA();
        produitA.methodeA();



        
    }
}
