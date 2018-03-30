import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BuildTest {
    @Test
    public void shouldPass() throws Exception {
        assertThat("pass", is("pass"));
    }
}
