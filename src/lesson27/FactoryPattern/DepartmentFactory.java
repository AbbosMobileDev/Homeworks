package lesson27.FactoryPattern;

public abstract class DepartmentFactory {
    abstract Department crateDepartment(String departmentName, String yourName);

    Department createDepartmentWrapper(String departmentName, String yourName) {
        return createDepartmentWrapper(departmentName, yourName);
    }
}
