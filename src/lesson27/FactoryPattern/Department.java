package lesson27.FactoryPattern;

public abstract class Department {
    private String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }
    abstract String getDutyOfDepartment();
}
