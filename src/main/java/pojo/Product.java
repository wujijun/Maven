package pojo;

public class Product {
    private int id;
    private String productName;
    private double price;
    private String picture;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Product(int id, String productName, double price, String picture) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", picture='" + picture + '\'' +
                '}';
    }

    public Product() {
    }
}
