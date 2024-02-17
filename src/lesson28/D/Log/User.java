package lesson28.D.Log;

public class User {
    private Logger log;

    public User(Logger log) {
        this.log = log;
    }
    public void doSomeThing(){
        log.log("Something  happened in User class");
    }
}
