Here’s the Java code matching your existing structure and style (same pattern you’ve been using in IntelliJ IDEA), implementing UC13 with both loop and stream timing — no comments:

        ```java
import java.util.*;
import java.util.stream.*;

class Bogie {
    String type;
    int capacity;

    Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }
}

public class main {
    public static void main(String[] args) {
        System.out.println("=== Performance Comparison ===");

        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie(i % 2 == 0 ? "Passenger" : "Goods", i));
        }

        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.type.equals("Passenger")) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();

        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.type.equals("Passenger"))
                .collect(Collectors.toList());

        long endStream = System.nanoTime();

        long loopTime = endLoop - startLoop;
        long streamTime = endStream - startStream;

        System.out.println("Loop Time (ns): " + loopTime);
        System.out.println("Stream Time (ns): " + streamTime);
    }
}
```
