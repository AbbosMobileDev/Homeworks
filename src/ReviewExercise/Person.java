package ReviewExercise;

public class Person implements Comparable<Person>{
    private int age;
    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }





    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age,o.age);
    }
}
