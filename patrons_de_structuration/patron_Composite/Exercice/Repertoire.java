package patrons_de_structuration.patron_Composite.Exercice;

public interface Repertoire {

    String nom=null;
    String type=null;
    void decrire();
    void ajouter(Repertoire re);
    void Supprimer(String nom);
    Repertoire Obtenir(String nom);

    
}
