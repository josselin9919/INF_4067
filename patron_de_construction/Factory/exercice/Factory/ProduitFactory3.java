package patron_de_construction.Factory.exercice.Factory;

public class ProduitFactory3 extends ProduitFactory{
    protected ProduitA createProduitA(){
        return new ProduitA3();
    }
}
