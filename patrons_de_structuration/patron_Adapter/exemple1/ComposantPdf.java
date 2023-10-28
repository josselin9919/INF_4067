package patrons_de_structuration.patron_Adapter.exemple1;

public class ComposantPdf {


    public int pdfFixeContenu(String contenu){
        
        System.out.println("on a fixe le contenue du fichier pdf");
        return 1;
    }
    public int pdfPrepareAffichage(){
        System.out.println("on a preparer l'affichage du fichier pdf");
        return 1;
    }
    public int pdfRafraichir(){
        System.out.println("on a rafraichir du fichier pdf");
        return 1;}
    public int pdfTermineAffichage(){
        System.out.println("on a termine l'affichage du fichier pdf");
        return 1;}
    public int pdfEnvoieImprimante(){
        System.out.println("on a envoie a l'imprimante le fichier pdf");
        return 1;}
}
