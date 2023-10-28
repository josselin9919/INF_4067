package patrons_de_structuration.patron_Adapter.exemple1;

public class DocumentHtml implements Document {

    public int setContenu(String contenue) {
    try {
        return 1;
    } catch (Exception e) {
       
        return 0;
    }
    }

    public int dessine() {
        try {
        return 1;
    } catch (Exception e) {
        return 0;
    }
    }

    public int imprime() {
        try {
        return 1;
    } catch (Exception e) {
        return 0;
    }
    }
    
}
