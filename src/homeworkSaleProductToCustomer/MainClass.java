package homeworkSaleProductToCustomer;

public class MainClass {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "Rufat Gadirov", "+994502111110", "Aghdash", 500);
        Customer customer2 = new Customer(2, "Huseyin Najafli", "+994512222222", "Ordubad", 550);
        Customer customer3 = new Customer(3, "Islam Babayev", "+994553334554", "Baku", 590);

        Product product1 = new Product(1, "Computer", 300, "HP", 2);
        Product product2 = new Product(2, "Scanner", 100, "Samsung", 4);
        Product product3 = new Product(3, "Mouse", 50, "Acer", 6);

        Shopping shopping1 = new Shopping(1, customer1, product1);
        System.out.println(shopping1.shoppingPresentation());

        Shopping shopping2 = new Shopping(2, customer2, product3);
        System.out.println(shopping2.shoppingPresentation());

        Shopping shopping3 = new Shopping(3, customer1, product1);
        System.out.println(shopping3.shoppingPresentation());

        Shopping shopping4 = new Shopping(4, customer3, product2);
        System.out.println(shopping4.shoppingPresentation());

        
        System.out.println(product3.productPresentation());
        System.out.println(customer3.customerProduction());

    }
}
