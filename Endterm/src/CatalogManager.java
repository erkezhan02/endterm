import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CatalogManager {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public boolean updateProduct(String model, double price, String description) {
        for (Product product : products) {
            if (product.getModel().equalsIgnoreCase(model)) {
                product.setPrice(price);
                product.setDescription(description);
                return true;
            }
        }
        return false;
    }

    public boolean removeProduct(String model) {
        return products.removeIf(product -> product.getModel().equalsIgnoreCase(model));
    }

    public void printCatalog(String order) {
        Comparator<Product> comparator = Comparator.comparingDouble(Product::getPrice);
        if ("desc".equalsIgnoreCase(order)) {
            comparator = comparator.reversed();
        }

        products.stream()
                .sorted(comparator)
                .forEach(System.out::println);
    }
}
