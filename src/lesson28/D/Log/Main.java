package lesson28.D.Log;

public class Main {
    public static void main(String[] args) {
        Logger logger = new FileLogger();
        User user1= new User(logger);
        user1.doSomeThing();

        Logger logger2 = new ConsoleLogger();
        User user2= new User(logger2);
        user2.doSomeThing();
    }
}
