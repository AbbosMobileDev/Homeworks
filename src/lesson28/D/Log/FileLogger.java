package lesson28.D.Log;

public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("This file log :"+ message);
    }
}
