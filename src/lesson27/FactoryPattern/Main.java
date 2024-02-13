package lesson27.FactoryPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DepartmentCreator departmentCreator = new DepartmentCreator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name!");
        String name = scanner.nextLine();
        System.out.println("Please enter your department!");
        String department = scanner.nextLine();

        Department department1= departmentCreator.crateDepartment(department,name);
        System.out.println(department1.getDutyOfDepartment());
        System.out.println(department1.getName());
    }
}
