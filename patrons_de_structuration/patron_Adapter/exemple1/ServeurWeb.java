package patrons_de_structuration.patron_Adapter.exemple1;

public class ServeurWeb {
    public static void main(String[] args) {
        Document doc=new DocumentHtml();
        String contenue ="contenue du document";
        
        
        doc.setContenu(contenue);
        doc.dessine();
        doc.imprime();


        Document doc1=new DocumentPdf();

        doc1.setContenu(contenue);
        doc1.dessine();
        doc1.imprime();
        

    }
    
}
