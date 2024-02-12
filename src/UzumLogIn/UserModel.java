package UzumLogIn;

public class UserModel {
    private String name;
    private String pasword;
    private String login;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "name='" + name + '\'' +
                ", pasword='" + pasword + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
