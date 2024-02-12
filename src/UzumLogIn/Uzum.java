package UzumLogIn;

import java.util.Scanner;

public class Uzum {
    public static void main(String[] args) {
        DataBase user1 = new DataBase();
        System.out.println("Uzum ilovasiga xush kelibsiz ! ");
        while (true)
        {Scanner scanner = new Scanner(System.in);
        System.out.println("1) Ro'yxatdan o'tish \n 2)Accauntga kirish\n 3)Accauntni o'chirish");
        int begin = scanner.nextInt();

            switch (begin) {
                case 1:
                    System.out.println("Ismingizni kiriting : ");
                    String name = scanner.next();


                default:
                    System.out.println("Bunday bo'lim mavjud emas !");
            }


        }

    }
        }


