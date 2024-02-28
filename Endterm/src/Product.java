public class Product {
    private String model;
    private double price;
    private String description;

    public Product(String model, double price, String description) {
        this.model = model;
        this.price = price;
        this.description = description;
    }

    // Getters and Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Price: " + price + ", Description: " + description;
    }
}
