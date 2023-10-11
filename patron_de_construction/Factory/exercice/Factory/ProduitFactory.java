package patron_de_construction.Factory.exercice.Factory;

public abstract  class ProduitFactory {
    

    public  ProduitA getProduitA() {
        return createProduitA();
    }
    protected abstract ProduitA createProduitA();
}
