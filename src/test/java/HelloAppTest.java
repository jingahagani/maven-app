import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloAppTest {

    @Test
    public void testAdd() {
        assertEquals(20, HelloApp.mul(4, 5));
    }
}
