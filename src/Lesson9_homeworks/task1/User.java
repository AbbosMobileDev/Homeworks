package Lesson9_homeworks.task1;

public class User {
    private String lastName;

    public User(String lastName, String firstName, int age, int phoneNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    private String firstName;
    private int age;

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    private int phoneNumber;

}
