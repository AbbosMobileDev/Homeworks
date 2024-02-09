package AbbosArray;

import java.util.Arrays;

public class MyList<T> {
    private int capasity;
    private Object[] obj;
    private int size = 0;
    public MyList(int capasity) {
        this.capasity = capasity;
        obj = new Object[capasity];
    }
    public MyList() {
        this.capasity = 10;
        obj = new Object[capasity];
    }

    public void add(Object c) {
        capasity();
        Object[] objects = new Object[capasity];
        int i = 0;
        for (int j = 0; j < size(); j++) {
            objects[i] = obj[j];
            i++;
        }
        objects[i] = c;
        obj = objects;
        size();

    }
    public void capasity() {
        if (capasity-size<=0) {
            capasity = (capasity * 3) / 2 + 1;
        }
    }
    public T getElement(int indexOfElement){
        return (T) obj[indexOfElement];
    }
    public int getSize(){
        return size;
    }
    public int getLenght(){
        return obj.length;
    }
    public boolean search(T element){
        for (Object o : obj) {
            if (o== element) return true;
        }
        return false;
    }
    public int size() {
        int count = 0;
        for (Object o : obj) {
            if (o == null) {
                continue;
            }
            count++;
        }
        size = count;
        return size;
    }
    public int IndexOfelement(T element){
        for (int i = 0; i < size()-1; i++) {
            if (obj[i]==element) return i;
        }
        return -1;
    }
    public int IndexOfLast(T element){
        for (int i = size()-1; i>=0; i--) {
            if (obj[i]==element) return i;
        }
        return -1;
    }


    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(obj,size));
    }
}
