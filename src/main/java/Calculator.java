import java.util.Arrays;

public class Calculator {
    public String[] toUniqueUppercase(String[] fruits) {

        return Arrays.asList(fruits).stream().map((fruit) -> fruit.toUpperCase()).distinct().toArray(String[]::new);

    }
}
