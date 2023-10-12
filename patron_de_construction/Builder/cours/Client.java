package patron_de_construction.Builder.cours;

public class Client {
    public static void main(String[] args) {
        MonteurPizza monteurReine= new MonteurPizzaReine();
        MonteurPizza monteurPiquante= new MonteurPizzaPiquante();


        Directeur directeur1 = new Directeur(monteurPiquante);
        Directeur directeur2 = new Directeur(monteurReine);

        directeur1.construire();
        directeur2.construire();


        Pizza pizza1 = monteurReine.getPizza();
        Pizza pizza2 = monteurPiquante.getPizza();

        pizza1.print();
        pizza2.print();
    }
}
