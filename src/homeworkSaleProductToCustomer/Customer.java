package homeworkSaleProductToCustomer;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private String fullName;
    private String phone;
    private String address;
    private int balance;
    private List<Product> myProductList;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", balance=" + balance +
                ", myProductList=" + myProductList +
                '}';
    }

    public String customerProduction(){
        StringBuilder s = new StringBuilder();
        int spentForProducts = 0;
        if(getMyProductList().size() > 0){
            for (int i = 0; i < this.getMyProductList().size(); i++) {
                s.append(getMyProductList().get(i).getName());
                if (i != this.getMyProductList().size()-1) s.append(", ");
                spentForProducts += getMyProductList().get(i).getPrice();
            }
        }
        else s.append(" nothing");
        return String.format("Today %s bought %s and spent %d AZN. Now he/she has %d AZN!", this.getFullName(), s.toString(), spentForProducts, this.getBalance());
    }

    public Customer(int id, String fullName, String phone, String address, int balance) {
        this.id = id;
        this.fullName = fullName;
        this.phone = phone;
        this.address = address;
        this.balance = balance;
        this.myProductList = new ArrayList<>();
    }

    public List<Product> getMyProductList() {
        return myProductList;
    }

    public void setMyProductList(List<Product> myProductList) {
        this.myProductList = myProductList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
