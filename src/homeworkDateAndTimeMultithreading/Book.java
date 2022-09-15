package homeworkDateAndTimeMultithreading;

public class Book {
      String name;
      int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void increasePrice(int i) {
        this.price = this.price + i;
    }
}
