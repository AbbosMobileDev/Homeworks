package lesson17.Array;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class example {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("Salom");
        arrayList.add(" dasturchi");
        arrayList.remove(1);
        arrayList.set(0,"Abbos");
        arrayList.add(12);
        arrayList.add(1244);
        arrayList.add("owef");

        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList);

    }
}
