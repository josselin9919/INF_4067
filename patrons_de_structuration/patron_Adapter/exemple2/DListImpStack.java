package patrons_de_structuration.patron_Adapter.exemple2;

public class DListImpStack extends DList implements Stack {

    public void push(Object o) {
        insertTail(o);
    }

    public Object pop() {
        return removeTail();
    }

    public Object top() {
        return getTail();
    }
    
}
