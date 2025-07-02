import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testAdd() {
        App app = new App();
        int result = app.add(5, 3);
        assertEquals(8, result);
    }
}
