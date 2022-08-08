package homeworkProductQuantityCalcuation;

public class MainClass {
    public static void main(String[] args) {
        Product[] products = {new Product(1, "Tea", 6.5, 6),
                            new Product(2, "Sugar", 1.9, 14),
                            new Product(3, "Flour", 2.4, 30)};
        System.out.println(QuantityCalculator.calculator(products));
    }
}
