package homeworkDateAndTimeMultithreading;

public class BookThread implements Runnable{
    Book book;

    public BookThread(Book book){
        this.book = book;
    }

    @Override
    public void run() {
        book.increasePrice(1);
    }
}
