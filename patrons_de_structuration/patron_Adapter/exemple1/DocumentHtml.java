package patrons_de_structuration.patron_Adapter.exemple1;

public class DocumentHtml implements Document {

    public int setContenu(String contenue) {
    try {
        System.out.println("on a modifier le contenue du fichier html");
        return 1;
    } catch (Exception e) {
       
        return 0;
    }
    }

    public int dessine() {
        try {
            System.out.println("on a dessine le fichier html");
        return 1;
    } catch (Exception e) {
        return 0;
    }
    }

    public int imprime() {
        try {
            System.out.println("on imprime le contenue du fichier html");
        return 1;
    } catch (Exception e) {
        return 0;
    }
    }
    
}
