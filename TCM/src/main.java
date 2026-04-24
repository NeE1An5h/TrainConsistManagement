import java.util.*;

class InvalidCapacityException extends Exception {
    InvalidCapacityException(String message) {
        super(message);
    }
}

class Bogie {
    String type;
    int capacity;

    Bogie(String type, int capacity) throws InvalidCapacityException {
        if (type.equalsIgnoreCase("Passenger") && capacity <= 0) {
            throw new InvalidCapacityException("Invalid capacity for passenger bogie");
        }
        this.type = type;
        this.capacity = capacity;
    }
}

public class main {
    public static void main(String[] args) {
        System.out.println("=== Bogie Creation with Validation ===");

        List<Bogie> bogies = new ArrayList<>();

        try {
            bogies.add(new Bogie("Passenger", 72));
            bogies.add(new Bogie("Passenger", 0));
        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Total bogies added: " + bogies.size());
    }
}
