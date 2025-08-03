// src/main/java/com/shop/model/Product.java


public class Product {
    private int id;
    private String name;
    private double price;
    private String size;
    private String image;

    public Product(int id, String name, double price, String size, String image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.size = size;
        this.image = image;
    }

    // Getters and setters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getSize() { return size; }
    public String getImage() { return image; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }
    public void setSize(String size) { this.size = size; }
    public void setImage(String image) { this.image = image; }
}
