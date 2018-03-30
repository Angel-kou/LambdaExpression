import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CalculatorTest {
    @Test
    public void shouldReturnCorrectResult() throws Exception {
        String[] inputs = new String[]{"apple", "banana", "Watermelon", "che1rry", "Watermelon", "baNaNa", "gRape"};
        Calculator calculator = new Calculator();

        String[] result = calculator.toUniqueUppercase(inputs);
        String[] expected = new String[]{"APPLE", "BANANA", "WATERMELON", "CHE1RRY", "GRAPE"};

        assertThat(result, is(expected));
    }
}
