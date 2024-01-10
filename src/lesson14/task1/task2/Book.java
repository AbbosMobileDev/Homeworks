package lesson14.task1.task2;

public class Book {
    private String nameOfBook;
    private double priceOfBook;

    public Book(String nameOfBook, double priceOfBook) {
        this.nameOfBook = nameOfBook;
        this.priceOfBook = priceOfBook;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public double getPriceOfBook() {
        return priceOfBook;
    }
}
