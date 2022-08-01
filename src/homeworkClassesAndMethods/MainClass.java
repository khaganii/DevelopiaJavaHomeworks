package homeworkClassesAndMethods;

public class MainClass {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        book1.setId(1);
        book1.setName("HeadFirst");
        book1.setPageCount(500);
        book1.setAuthor("JavaDeveloper1");
        book1.setDescription("About Java");

        book2.setId(2);
        book2.setName("OCA-Java Developer I");
        book2.setPageCount(350);
        book2.setAuthor("JavaDeveloper2");
        book2.setDescription("About Associate Java");

        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }
}
