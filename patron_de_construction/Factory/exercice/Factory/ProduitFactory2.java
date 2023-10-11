package patron_de_construction.Factory.exercice.Factory;

public class ProduitFactory2 extends ProduitFactory{
    protected ProduitA createProduitA(){
        return new ProduitA2();
    }
}