package lesson28.S.Farm;

public class Worker {
    private String name;
    private String ocupation;
    private int age;

    public Worker(String name, String ocupation, int age) {
        this.name = name;
        this.ocupation = ocupation;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getOcupation() {
        return ocupation;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", ocupation='" + ocupation + '\'' +
                ", age=" + age +
                '}';
    }
}
