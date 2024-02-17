package ReviewExercise;

import java.util.Arrays;

public class ArrayPerson {
    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0]= new Person(12);
        person[1]= new Person(10);
        person[2]= new Person(15);
        person[3]= new Person(11);
        Arrays.sort(person);
        System.out.println(Arrays.toString(person));
    }
}
