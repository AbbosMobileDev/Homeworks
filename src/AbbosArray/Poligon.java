package AbbosArray;

public class Poligon {
    public static void main(String[] args) {
        MyList<Integer> abbosList = new MyList<>();
        abbosList.add(21);
        abbosList.add(212);
        abbosList.add(34);
        abbosList.add(34);
        abbosList.add(34);
        abbosList.add(34);
        abbosList.add(34);
        abbosList.add(23);
        abbosList.add(34);
        abbosList.add(34);
        abbosList.add(34);
        abbosList.add(34);
        abbosList.add(34);
        abbosList.add(34);

        System.out.println(abbosList);
        System.out.println(abbosList.search(34));
        System.out.println(abbosList.getElement(2));

        System.out.println(abbosList.getSize());
    }
}
