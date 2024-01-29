package PrepareToExam;

public class ConstructorCopy implements Cloneable {
    int id;
    String name;
    Subject subObj;

    public void Subject(int id, String name, Subject subObj) {
        this.id = id;
        this.name = name;
        this.subObj = subObj;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
