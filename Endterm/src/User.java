import java.util.Scanner;

public interface User {
    void displayOptions();
    boolean handleCommand(Scanner scanner, CatalogManager catalogManager);
}