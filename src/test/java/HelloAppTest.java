import org.junit.jupiter.api.Test;
 
import static org.junit.jupiter.api.Assertions.assertEquals;
 
public class HelloAppTest {
 
    @Test
    public void testMessage() {
        assertEquals(
            "Hello from my Maven application!",
            HelloApp.getMessage()
        );
    }
}
