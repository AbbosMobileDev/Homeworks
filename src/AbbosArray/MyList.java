package AbbosArray;

public class MyList<T> {

    private static final Object[] EMPTY_ELEMENTDATA = {};
    private int capasity;
    private Object[] obj;
    private static final Object[] default_obj = {};
    private int index = 0;
    private int size = 0;

    public MyList(int capasity) {
        this.capasity = capasity;
        obj = new Object[capasity];
    }

    public MyList() {
        this.capasity = 10;
        obj = new Object[capasity];
    }

    public void add(int element) {
        capasity();
        obj[index++] = element;
        size++;

    }
    public void capasity() {
        if (capasity == size) {
            capasity = (capasity * 3) / 2 + 1;
        }
    }
    public T getElement(int indexOfElement){
        return (T) obj[indexOfElement];
    }

}
