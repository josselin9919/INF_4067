package patron_de_construction.Builder.exercice;

public class Directeur {
    private MonteurPizza monteurPizza;

    public Directeur(MonteurPizza monteurPizza){
        this.monteurPizza=monteurPizza;
    }

    public void construire(){
        monteurPizza.creerNouvellePizza();
        monteurPizza.monterPate();
        monteurPizza.monterSauce();
        monteurPizza.monterGarniture();
    }
}
