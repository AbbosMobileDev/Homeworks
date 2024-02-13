package lesson27.FactoryPattern;

public class DepartmentCreator extends DepartmentFactory {

    @Override
    Department crateDepartment(String departmentName, String name) {
        return switch (departmentName) {
            case "programmer" -> new ProgrammersDepartment(name);
            case "marketing" -> new MarketingDepartment(name);
            case "finance" -> new FinanceDepartment(name);
            default -> throw new RuntimeException("Don't exist like this");
        };
    }
}
