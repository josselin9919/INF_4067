package patron_de_construction.Factory.exercice.Factory;

public class ProduitFactory1 extends ProduitFactory{
    protected ProduitA createProduitA(){
        return new ProduitA1();
    }
}