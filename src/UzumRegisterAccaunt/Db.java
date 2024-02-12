package UzumRegisterAccaunt;

import AbbosArray.MyList;

public class Db {

    MyList<String> userName = new MyList<>();
    MyList<Integer> telephoneNumber = new MyList<>();
    MyList<String> passvorord = new MyList<>();

    @Override
    public String toString() {
        return "Db{" +
                "userName=" + userName +
                ", telephoneNumber=" + telephoneNumber +
                '}';
    }
}
