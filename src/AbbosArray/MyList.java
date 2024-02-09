package AbbosArray;

public class MyList<T> {

    private int index = 0;
    private int copasity=10;
    private int size=0;
    private T[] myList = (T[]) new Object[copasity];

    public MyList(int copasity) {
        this.copasity = copasity;
    }
    public void add(T value) {
        if (size==copasity) this.copasity=copasity*3/2+1;
        myList[index++] = value;
        size++;
    }

    public int lenght() {
        return myList.length;
    }

    public T get(int index) {
        return myList[index];
    }
}
