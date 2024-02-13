package lesson27.FactoryPattern;

public class MarketingDepartment extends Department
{
    public MarketingDepartment(String name) {
        super(name);
    }

    @Override
    String getDutyOfDepartment() {
        return "This department duty in 3-4-days on the week";
    }
}
