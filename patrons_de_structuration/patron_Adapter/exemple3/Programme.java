package patrons_de_structuration.patron_Adapter.exemple3;

public class Programme {
    public static void main(String[] args) {
        AdaptRectangle carr = new AdaptRectangle();
        carr.cote=7;
        System.out.println("le perimetre est de : "+carr.perimetre()+" et l'aire est de : "+carr.aire()+" pour un cote de :"+carr.cote);

        carr.cote=5;
        System.out.println("le perimetre est de : "+carr.perimetre()+" et l'aire est de : "+carr.aire()+" pour un cote de :"+carr.cote);

        carr.cote=4;
        System.out.println("le perimetre est de : "+carr.perimetre()+" et l'aire est de : "+carr.aire()+" pour un cote de :"+carr.cote);

        carr.cote=9;
        System.out.println("le perimetre est de : "+carr.perimetre()+" et l'aire est de : "+carr.aire()+" pour un cote de :"+carr.cote);
    }
    
}
