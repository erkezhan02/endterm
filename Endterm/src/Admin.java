import java.util.Scanner;

public class Admin implements User {
    @Override
    public void displayOptions() {
        System.out.println("Admin Options:");
        System.out.println("1: Add iPhone");
        System.out.println("2: Update iPhone");
        System.out.println("3: Delete iPhone");
        System.out.println("4: View Catalog");
        System.out.println("5: Exit");
    }

    @Override
    public boolean handleCommand(Scanner scanner, CatalogManager catalogManager) {
        String option = scanner.nextLine();

        switch (option) {
            case "1":
                System.out.println("Enter model: ");
                String model = scanner.nextLine();
                System.out.println("Enter price: ");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter description: ");
                String description = scanner.nextLine();
                catalogManager.addProduct(new Product(model, price, description));
                System.out.println("Product added.");
                break;
            case "2":
                System.out.println("Enter model to update: ");
                String updateModel = scanner.nextLine();
                System.out.println("Enter new price: ");
                double updatePrice = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter new description: ");
                String updateDescription = scanner.nextLine();
                boolean updated = catalogManager.updateProduct(updateModel, updatePrice, updateDescription);
                if (updated) {
                    System.out.println("Product updated.");
                } else {
                    System.out.println("Product not found.");
                }
                break;
            case "3":
                System.out.println("Enter model to delete: ");
                String deleteModel = scanner.nextLine();
                boolean removed = catalogManager.removeProduct(deleteModel);
                if (removed) {
                    System.out.println("Product removed.");
                } else {
                    System.out.println("Product not found.");
                }
                break;
            case "4":
                System.out.println("Enter order (asc/desc): ");
                String order = scanner.nextLine();
                catalogManager.printCatalog(order);
                break;
            case "5":
                return true;
            default:
                System.out.println("Invalid option.");
                break;
        }
        return false;
    }
}