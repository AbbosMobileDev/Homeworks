package Lesson16.Abstraction1;

public class Main {
    public static void main(String[] args) {
        A firstStudent = new A(21, 23, 83, 12);
        B secondClass = new B(34, 76, 23);
        firstStudent.getPersentage();
        System.out.println( "///////////////////");
        secondClass.getPersentage();
    }
}
