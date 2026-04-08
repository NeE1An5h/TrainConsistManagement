import java.util.ArrayList;
import java.util.List;

public class main{
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<String> consist = new ArrayList<>();

        consist.add("Sleeper");
        consist.add("AC Chair");
        consist.add("First Class");

        System.out.println("Bogies after addition: " + consist);

        consist.remove("AC Chair");

        System.out.println("Is Sleeper present: " + consist.contains("Sleeper"));

        System.out.println("Final bogie list: " + consist);
    }
}