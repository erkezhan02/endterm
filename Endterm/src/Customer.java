import java.util.Scanner;

public class Customer implements User {
    @Override
    public void displayOptions() {
        System.out.println("Customer Options:");
        System.out.println("1: View Catalog");
        System.out.println("2: Exit");
    }

    @Override
    public boolean handleCommand(Scanner scanner, CatalogManager catalogManager) {
        String option = scanner.nextLine();

        switch (option) {
            case "1":
                System.out.println("Enter order (asc/desc): ");
                String order = scanner.nextLine();
                catalogManager.printCatalog(order);
                break;
            case "2":
                return true;
            default:
                System.out.println("Invalid option.");
                break;
        }
        return false;
    }
}