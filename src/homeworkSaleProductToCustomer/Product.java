package homeworkSaleProductToCustomer;

public class Product {
    private int id;
    private String name;
    private int price;
    private String company;
    private  int count;

    public String productPresentation(){
        return String.format("There is/are %d %s by %s in our stock!", this.getCount(), this.getName(), this.getCompany());
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Product(int id, String name, int price, String company, int count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.company = company;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
