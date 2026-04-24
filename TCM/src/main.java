import java.util.*;

public class main {
    public static void main(String[] args) {
        System.out.println("=== Safe Search Operation ===");

        List<String> bogieIds = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        if (bogieIds.isEmpty()) {
            throw new IllegalStateException("No bogies available in the train. Search cannot be performed.");
        }

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(key)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie ID found");
        } else {
            System.out.println("Bogie ID not found");
        }
    }
}