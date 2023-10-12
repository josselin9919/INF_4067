package patron_de_construction.AbstractFactory.cours;

public class ProduitFactory1 implements IProduitFactory{

    public ProduitA getProduitA() {
        return new ProduitA1();
    }


    public ProduitB getProduitB() {
        return new ProduitB1();
    }

    
}
