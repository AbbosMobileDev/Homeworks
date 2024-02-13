package lesson27.FactoryPattern;

public class ProgrammersDepartment extends  Department{
    public ProgrammersDepartment(String name) {
        super(name);
    }

    @Override
    String getDutyOfDepartment() {
        return "This department duty in 1-2-days on the week";
    }
}
