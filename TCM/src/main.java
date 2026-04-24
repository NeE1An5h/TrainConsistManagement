import java.util.*;

public class main {
    public static void main(String[] args) {
        System.out.println("=== Linear Search for Bogie ID ===");

        String[] bogieIds = {"TRN101", "TRN205", "TRN309", "TRN412", "TRN550"};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

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