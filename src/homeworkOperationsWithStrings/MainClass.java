package homeworkOperationsWithStrings;

public class MainClass {
    public static void main(String[] args) {
        String text = "Java is a high-level and class-based and object-oriented programming " +
                "language that is designed to have as few implementation dependencies as possible";

        System.out.println("Character count: " + text.length());
        System.out.println("Word count: " + text.split(" ").length);
        System.out.println("Captured Memory: " + text.length()*16 + " bit");
        System.out.println("First index of 'b' is : " + text.indexOf('b'));
        System.out.println("Text with only lowercase: " + text.toLowerCase());
        System.out.println("Text with only UPPERCASE: " + text.toUpperCase());
        System.out.println("Text contains 'class' : " + (text.contains("class") ? "YES":"NO"));

        //------------------------------------------------------------------------

        System.out.println("Count of created words: " + Problem.calculate(2, 5, 5));
    }
}
