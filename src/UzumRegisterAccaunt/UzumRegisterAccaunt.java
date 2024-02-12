package UzumRegisterAccaunt;

import java.util.Objects;
import java.util.Scanner;

public class UzumRegisterAccaunt {
    public static void main(String[] args) {
        Db database = new Db();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Assalomu alaykum, Uzumbank ilovasiga xush kelibsiz");
        System.out.println("1) Ro'yxatdan o'tish \n 2)Accauntga kirish\n 3)Accauntni o'chirish");
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
                } else {
                    System.out.println("Bu foydalanuvchi oldin royxatdan o'tgan");
                    // nishon qoyish kerak case 1 dan keyin
                }
                break;
            case 2:
                System.out.print("Usernameni kiriting");
                String userName1 = scanner.next();
                if (!database.userName.search(userName1)) {
                    System.out.print("Bunday user mavjud emas ! Iltimos boshqatdan kiriting :");
                    //goto qoyish kerak case 2 dan kein
                } else {
                    System.out.print("Paswordni kiriting:");
                    String pasword2 = scanner.next();
                    if (Objects.equals(database.passvorord.getElement(database.userName.IndexOfelement(userName1)), pasword2)) {
                        System.out.println("Siz muvofaqqiyatli akkauntga kirdingiz");
                    } else {
                        System.out.println("Parol xato! Qayta urinib ko'ring .");
                        //goto qoyish kk parol sorawdan oldin
                    }

                }
                break;
            case 3:
                System.out.println("O'chirmoqchi bo'lgan akkaunt usernamemini kiriting :");
                String removeUser = scanner.next();
                if (!database.userName.search(removeUser)) {
                    System.out.println("Bunday user mavjud emas ! qaytadan kiriting .");
                    //goto qoyish kerak case 3 dan keyin
                } else {
                    System.out.print("Paswordni kiriting:");
                    String pasword3 = scanner.next();
                    if (Objects.equals(database.passvorord.getElement(database.userName.IndexOfelement(removeUser)), pasword3))
                    {
                        database.telephoneNumber.removeElement(database.telephoneNumber.getElement(database.userName.IndexOfelement(removeUser)));
                        database.passvorord.removeElement(database.passvorord.getElement(database.userName.IndexOfelement(removeUser)));
                        database.userName.removeElement(removeUser);
                        System.out.println("Siz muvofaqqiyatli akkaunt o'chirdingiz");
                    } else {
                        System.out.println("Siz noto'g'ri parol kiritdingiz ! Iltimos qaytadan urinib ko'ring .");
                        //goto qoyish kk 58-qatordan keyin
                    }
                }

            default:
                System.out.println("Siz mavjud bo'lmagan bo'limni taladingiz ");
                //begindan oldinga nishon qoyish kerak

        }
    }

}
