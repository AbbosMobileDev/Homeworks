package AbbosArray;

public interface MyArray<T> {
    void add(T c);
    void capasity();
    T getElement(int indexOfElement);
    int getSize();
    int getLenght();
    boolean search(T element);
    int size();
    int IndexOfelement(T element);
    int IndexOfLast(T element);
    void removeElement(T element);

}
