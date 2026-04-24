import java.util.*;

class CargoSafetyException extends RuntimeException {
    CargoSafetyException(String message) {
        super(message);
    }
}

class Bogie {
    String shape;
    String cargo;

    Bogie(String shape) {
        this.shape = shape;
    }

    void assignCargo(String cargo) {
        if (shape.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
            throw new CargoSafetyException("Unsafe cargo assignment");
        }
        this.cargo = cargo;
    }
}

public class main {
    public static void main(String[] args) {
        System.out.println("=== Cargo Assignment Safety Check ===");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Cylindrical"));
        bogies.add(new Bogie("Rectangular"));

        for (Bogie b : bogies) {
            try {
                if (b.shape.equalsIgnoreCase("Cylindrical")) {
                    b.assignCargo("Petroleum");
                } else {
                    b.assignCargo("Petroleum");
                }
                System.out.println("Cargo assigned to " + b.shape + " bogie");
            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Attempt completed for " + b.shape + " bogie");
            }
        }

        System.out.println("Program continues...");
    }
}