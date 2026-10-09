import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloAppTest {

    @Test
    public void testAdd() {
        assertEquals(30, HelloApp.mul(6, 5));
    }
}
