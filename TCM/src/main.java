import java.util.*;

public class main {
    public static void main(String[] args) {
        System.out.println("=== Sorting Bogie Types Alphabetically ===");

        String[] bogieTypes = {"Cylindrical", "Box", "Flatbed", "Passenger", "Goods"};

        Arrays.sort(bogieTypes);

        System.out.println("Sorted Bogie Types:");
        System.out.println(Arrays.toString(bogieTypes));
    }
}