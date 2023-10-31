package patrons_de_structuration.patron_Adapter.exemple3;

public class AdaptRectangle implements ICarre{
    public Rectangle rectangle=new Rectangle();
    public float cote;
    
    public float perimetre() {
        rectangle.SetLarg(cote);
        rectangle.SetLong(cote);
        return rectangle.perimetre();
    }

    public float aire() {
        rectangle.SetLarg(cote);
        rectangle.SetLong(cote);
        return rectangle.aire();
    }
    
}
