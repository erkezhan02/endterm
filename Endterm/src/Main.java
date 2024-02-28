import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CatalogManager catalogManager = new CatalogManager();
        User user = null;

        while (true) {
            System.out.println("Choose role: Admin (A) / Customer (C) / Exit (E)");
            String userType = scanner.nextLine();

            switch (userType.toUpperCase()) {
                case "A":
                    user = new Admin();
                    break;
                case "C":
                    user = new Customer();
                    break;
                case "E":
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please enter A for Admin, C for Customer, or E to Exit.");
                    continue;
            }

            while (true) {
                user.displayOptions();
                boolean shouldBreak = user.handleCommand(scanner, catalogManager);
                if (shouldBreak) {
                    break;
                }
            }
        }
    }
}
