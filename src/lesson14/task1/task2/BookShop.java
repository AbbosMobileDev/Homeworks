package lesson14.task1.task2;

public class BookShop {
    private String nameOfBookShop;
    private double sizeOfMoney;
    private int boughtBook=0;
    

    public BookShop(String nameOfBookShop, double sizeOfMoney) {
        this.nameOfBookShop = nameOfBookShop;
        this.sizeOfMoney = sizeOfMoney;
    }
    public void buyBook(Book book, int numberBook){
        if(numberBook * book.getPriceOfBook() > sizeOfMoney)
            System.out.println("Buncha miqdordagi kitoblarni sotib olib bo'lmaaydi  !");
        else
        {
            sizeOfMoney-=numberBook*book.getPriceOfBook();
            System.out.println("qolgan mablag' :" + sizeOfMoney);
            System.out.println("Sotib olingan kitoblar miqdori : "+numberBook);
            boughtBook+=numberBook;
        }

    }
public  boolean hasBook(){
        boolean yes =true;
        if (boughtBook == 0)
            yes = false;
        return yes;
}

}
