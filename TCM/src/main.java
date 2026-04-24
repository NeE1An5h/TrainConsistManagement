import java.util.*;

class Bogie {
    String type;
    String cargo;

    Bogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class main {
    public static void main(String[] args) {
        System.out.println("=== Train Safety Validation ===");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Cylindrical", "Petroleum"));
        bogies.add(new Bogie("Box", "Coal"));
        bogies.add(new Bogie("Flatbed", "Steel"));
        bogies.add(new Bogie("Cylindrical", "Petroleum"));

        boolean isSafe = bogies.stream()
                .allMatch(b -> !b.type.equalsIgnoreCase("Cylindrical")
                        || b.cargo.equalsIgnoreCase("Petroleum"));

        if (isSafe) {
            System.out.println("Train is safety compliant");
        } else {
            System.out.println("Train is NOT safety compliant");
        }
    }
}