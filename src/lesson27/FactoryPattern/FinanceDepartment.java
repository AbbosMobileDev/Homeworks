package lesson27.FactoryPattern;

public class FinanceDepartment extends Department{
    public FinanceDepartment(String departmentName) {
                super(departmentName);
    }

    @Override
    String getDutyOfDepartment() {
        return "This department duty in 5-6-days on the week";
    }
}
