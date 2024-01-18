package lesson18.Collectiontask;

import java.util.ArrayList;
import java.util.Arrays;

public class Class {
    public static void main(String[] args) {
       ArrayList pupils = new ArrayList<>();
       ArrayList specialPupil = new ArrayList<>();
        pupils.add("Sarvar");
        pupils.add("Nazar");
        pupils.add("Muhi");
        pupils.add("Samar");
        pupils.add("Amar");
        pupils.add("Mirja");
        pupils.add("Axmad");
        pupils.add("Bilol");
        pupils.add("Nozim");
        pupils.add("Minor");
        pupils.add("Dengiz");
        pupils.add("Muruvat");

        specialPupil.add("Abbos");
        specialPupil.add("Minor");
        specialPupil.add("Bilol");
        specialPupil.add("Mirja");
        specialPupil.add("Begi");

        System.out.println("darsga kelganlar :"+ pupils);
        System.out.println("navbatchilar : " + specialPupil );

        specialPupil.removeAll(pupils);
        if(specialPupil.size() == 0 )
            System.out.println("Barcha navbatchilar kelgan !");
        else
        System.out.println("Darsga kelmagan navbatchilar : " +specialPupil);
    }



}
