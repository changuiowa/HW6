
package model;

/**
 *
 * @author changykim
 */
public class Products {
    
    private int productID;
    private String productName;
    private double price;
    private int quantity;
    private String company;

    public Products() {
        this.productID = 0;
        this.productName = "";
        this.price = 0;
        this.quantity = 0;
        this.company = "";
    }
    
    
    public Products(int productID, String productName, double price, int quantity, String company) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.company = company;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Products{" + "productID=" + productID + ", productName=" + productName + ", price=" + price + ", quantity=" + quantity + ", company=" + company + '}';
    }

    
}
