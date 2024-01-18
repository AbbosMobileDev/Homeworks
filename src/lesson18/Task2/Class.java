package lesson18.Task2;

import java.util.ArrayList;

public class Class {
    public static void main(String[] args) {
        ArrayList<String> footballTeam = new ArrayList<>();
        ArrayList<String> tennisTeam = new ArrayList<>();
        footballTeam.add("Saman");
        footballTeam.add("Siroj");
        footballTeam.add("Asqar");
        footballTeam.add("Nodir");
        footballTeam.add("Malik");
        footballTeam.add("Safar");
        footballTeam.add("Umid");
        footballTeam.add("Mirzo");
        footballTeam.add("Bobur");

        tennisTeam.add("Lola");
        tennisTeam.add("Umid");
        tennisTeam.add("Safar");
        tennisTeam.add("Jamol");
        tennisTeam.add("Umida");
        tennisTeam.add("Nodir");
        tennisTeam.add("Surayyo");
        tennisTeam.add("Komil");
        tennisTeam.add("Durdona");
        tennisTeam.add("Mirzo");
        tennisTeam.add("Malik");
        footballTeam.removeAll(tennisTeam);
        ArrayList<String> onlyFootball = new ArrayList<>(footballTeam);
        int sizeOfClassMembers = onlyFootball.size() + tennisTeam.size();
        System.out.println("Guruhdagi o'quvchilar soni :" + sizeOfClassMembers);
        System.out.println("Faqat futbol bilan sug'ullanuvchilar ro'yxati :" + onlyFootball);

    }


}
