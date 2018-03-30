import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CalculatorTest {
    @Test
    public void shouldReturnCorrectResult() throws Exception {
        String[] inputs = new String[]{
                "Cola: 3.5", "bread: 5.8", "fan: 83.20 yuan", "TV 1,2000 yuan", "Chair 76.34 yuan", "Chips 20.03"
        };

        assertThat(new Calculator().calculate(inputs), is(9143.66d));
    }
}
