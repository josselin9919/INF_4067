package patron_de_construction.Factory.cours.Factory_Method;

public class Client{
    public static void main(String[] args){
        ProduitFactory produitFactory =new ProduitFactory();
        ProduitA produitA = null;


        produitA = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA1);
        produitA.methodeA();


        produitA = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA2);
        produitA.methodeA();




        produitA = produitFactory.getProduitA(3);
        produitA.methodeA();
    }
}
