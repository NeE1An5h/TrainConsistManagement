import java.util.*;

public class main {
    public static void main(String[] args) {
        System.out.println("=== Bubble Sort for Passenger Bogie Capacities ===");

        int[] capacities = {72, 50, 90, 30, 65, 80};

        for (int i = 0; i < capacities.length - 1; i++) {
            for (int j = 0; j < capacities.length - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Capacities:");

        for (int c : capacities) {
            System.out.print(c + " ");
        }
    }
}