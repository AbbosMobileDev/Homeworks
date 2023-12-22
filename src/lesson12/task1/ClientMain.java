package lesson12.task1;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client(5, 2) ;
        client.addSum(30);
        System.out.println(client.call(5));
        System.out.println(client.isActive());
        System.out.println(client.sms(10));
        client.addSum(10);
    }
}
