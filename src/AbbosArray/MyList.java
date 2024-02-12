package AbbosArray;

import java.util.Arrays;

public class MyList<T> implements MyArray<T> {
    private int capasity;
    private Object[] obj;
    private int size = 0;
    private Object element;

    public MyList(int capasity) {
        this.capasity = capasity;
        obj = new Object[capasity];
    }

    public MyList() {
        this.capasity = 10;
        obj = new Object[capasity];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(obj, size));
    }

    @Override
    public void add(T c) {
        capasity();
        Object[] objects = new Object[capasity];
        int i = 0;
        for (int j = 0; j < size(); j++) {
            objects[i] = obj[j];
            i++;
        }
    }

    @Override
    public void capasity() {
        if (capasity - size <= 0) {
            capasity = (capasity * 3) / 2 + 1;
        }
    }

    @Override
    public T getElement(int indexOfElement) {
        return (T) obj[indexOfElement];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int getLenght() {
        return obj.length;
    }

    @Override
    public boolean search(T element) {
        for (Object o : obj) {
            if (o == element) return true;
        }
        return false;
    }

    @Override
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

    @Override
    public int IndexOfelement(T element) {
        for (int i = 0; i < size() - 1; i++) {
            if (obj[i] == element) return i;
        }
        return -1;
    }

    @Override
    public int IndexOfLast(T element) {
        for (int i = size() - 1; i >= 0; i--) {
            if (obj[i] == element) return i;
        }
        return -1;
    }

    @Override
    public void removeElement(T element) {
        Object[] objects = new Object[capasity];
        int index = 0 ;
        for (int i = 0; i < size(); i++) {
            if (obj[i]==element){
                continue;

            }
            objects[index]=obj[i];
            index++;

        }
        obj=objects;

    }
}
