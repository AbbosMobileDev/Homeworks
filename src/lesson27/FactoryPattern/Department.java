package lesson27.FactoryPattern;

public abstract class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    abstract String getDutyOfDepartment();
}
