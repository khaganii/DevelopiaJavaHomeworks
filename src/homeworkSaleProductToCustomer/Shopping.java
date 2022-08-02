package homeworkSaleProductToCustomer;

import java.util.List;

public class Shopping {
    private int id;
    private Customer customer;
    private Product product;
    private boolean status;


    public Shopping(int id, Customer customer, Product product) {
        if (customer.getBalance() >= product.getPrice() && product.getCount() > 0){
            this.status = true;
            this.id = id;
            this.customer = customer;
            this.product = product;
            int currentBalance = this.getCustomer().getBalance();
            this.customer.setBalance(currentBalance - product.getPrice());
            this.product.setCount(product.getCount() - 1);
            this.customer.getMyProductList().add(product);
        }
        else {
            this.status = false;
            System.out.println("Maybe Balance is not enough or product count is 0!");
        }
    }

    public String shoppingPresentation() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.status ? String.format("Shopping%d: %s bought %s and spent %d AZN! ", this.id, this.customer.getFullName(), this.product.getName(), this.product.getPrice())
                : "This Shopping did not happen!");
        sb.append("\n");
        if (this.status) {
            sb.append(customer.customerProduction()).append("\n");
            sb.append(product.productPresentation());
        }
        sb.append("\n-------------------------------------------------------------------------------");
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
