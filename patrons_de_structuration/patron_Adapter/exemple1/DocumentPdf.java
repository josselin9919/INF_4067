package patrons_de_structuration.patron_Adapter.exemple1;

public class DocumentPdf implements Document{
    public ComposantPdf outilpdf=new ComposantPdf();

    public int setContenu(String contenu) {
        try {
            
            return outilpdf.pdfFixeContenu(contenu);
        } catch (Exception e) {
            return 0;
        }
        
    }

    public int dessine() {
        try {
            int pdf =outilpdf.pdfPrepareAffichage();
            pdf =outilpdf.pdfRafraichir();
            pdf =outilpdf.pdfTermineAffichage();
            return pdf ;
        } catch (Exception e) {
            return 0;
        }
    }

    public int imprime() {
        try {
            return outilpdf.pdfEnvoieImprimante();
        } catch (Exception e) {
            return 0;
        }
    }
    
}
