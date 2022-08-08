package homeworkProductQuantityCalcuation;

public class QuantityCalculator {
    static int calculator(Product[] products){
        int sumOfQuantity = 0;
        for (Product product:products) {
            sumOfQuantity += product.quantity;
        }
        return sumOfQuantity;
    }
}
