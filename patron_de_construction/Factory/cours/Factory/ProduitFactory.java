package patron_de_construction.Factory.cours.Factory;

public abstract  class ProduitFactory {
    

    public  ProduitA getProduitA() {
        return createProduitA();
    }
    protected abstract ProduitA createProduitA();
}
