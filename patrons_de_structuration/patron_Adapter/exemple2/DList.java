package patrons_de_structuration.patron_Adapter.exemple2;

public class DList {
    public DNode list;
    public void insert (DNode pos,Object o){
        DNode po=new DNode();
        po.elem=o;
        po.suiv=pos.suiv;
        po.prec=pos;
        pos.suiv=po;
    }

    public void remove(DNode pos){
        pos.prec=pos.suiv;
    }

    public void insertHead(Object o){
        DNode ob=new DNode();
        ob.elem=o;
        ob.suiv=list;
        list.prec=ob;
        list=ob;
    }

    public Object removeHead(){
        Object ob=new Object();
        ob=list.elem;
        list=list.suiv;
        return ob;
    }
    public Object removeTail(){
        DNode ob=new DNode();
        ob=list;
        while(ob.suiv!=null){
            ob=ob.suiv;
        }
        ob.prec.suiv=null;
        ob.prec=null;
        return ob.elem;
    }


    public Object getHead(){return list.elem;}
    public Object getTail(){
        DNode ob=new DNode();
        ob=list;
        while(ob.suiv!=null){
            ob=ob.suiv;
        }
        
        return ob.elem;
    }

    
}
