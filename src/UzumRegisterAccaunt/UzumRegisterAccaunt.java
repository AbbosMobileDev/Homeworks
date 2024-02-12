package UzumRegisterAccaunt;

import java.util.Scanner;

public class UzumRegisterAccaunt {
    public static void main(String[] args) {
        Db database = new Db();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Assalomu alaykum, Uzumbank ilovasiga xush kelibsiz");
        System.out.println("1) Ro'yxatdan o'tish \n 2)Accauntga kirish");
        int begin = scanner.nextInt();
        switch (begin) {
            case 1:
                String username = scanner.nextLine();
                if (!database.userName.search(username)) {
                    Integer telephoneNumber = scanner.nextInt();
                    if (!database.telephoneNumber.search(telephoneNumber)) {
                        database.telephoneNumber.add(telephoneNumber);
                    } else {
                        System.out.println("bu raqam ro'yxatdan o'tgan iltimos boshqa raqam kiriting:");

//nishon qoyish kerak integer telephone numberdan oldin
                    }
                    database.userName.add(username);
                    String pasword = scanner.next();
                    database.passvorord.add(pasword);
                    System.out.println("Siz muvofaqqiyatli ro'yxatdan o'tdingiz !");
                }else {
                    System.out.println("Bu foydalanuvchi oldin royxatdan o'tgan");
                    // nishon qoyish kerak case 1 dan keyin
                }
                break;
            case 2:


            default:
                System.out.println("Siz mavjud bo'lmagan bo'limni taladingiz ");
                //begindan oldinga nishon qoyish kerak

        }
    }

}
