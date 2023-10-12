package patron_de_construction.Builder.exercice;

public class Client {
    public static void main(String[] args) {
        MonteurPizza monteurReine= new MonteurPizzaReine();
        MonteurPizza monteurPiquante= new MonteurPizzaPiquante();
        MonteurPizza monteurLocal = new MonteurPizzaLocal();


        Directeur directeur1 = new Directeur(monteurPiquante);
        Directeur directeur2 = new Directeur(monteurReine);
        Directeur directeur3 = new Directeur(monteurLocal);

        directeur1.construire();
        directeur2.construire();
        directeur3.construire();


        Pizza pizza1 = monteurReine.getPizza();
        Pizza pizza2 = monteurPiquante.getPizza();
        Pizza pizza3 = monteurLocal.getPizza();

        pizza1.print();
        pizza2.print();
        pizza3.print();
    }
}
