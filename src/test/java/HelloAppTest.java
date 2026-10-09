import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloAppTest {

    @Test
    public void testAdd() {
        assertEquals(25, HelloApp.mul(5, 5));
    }
}
