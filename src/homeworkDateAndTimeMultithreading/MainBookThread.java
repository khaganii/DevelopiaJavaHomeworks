package homeworkDateAndTimeMultithreading;

public class MainBookThread {
    public static void main(String[] args) throws InterruptedException {
        Book book = new Book("book", 1);
        showBookPrice(book);
        Thread[] threads = new Thread[20];

        for (int i = 0; i < 20; i++) {
            BookThread b = new BookThread(book);
            threads[i] = new Thread(b);
        }
        for (Thread t:threads) {
            t.start();
        }
        Thread.sleep(100);
        showBookPrice(book);
    }

    private static void showBookPrice(Book b) {
        System.out.println("Price = " + b.getPrice());
    }
}
