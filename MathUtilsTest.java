
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testAdd_pass() {
        int result = MathUtils.add(2, 3);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testAdd_fail() {
        int result = MathUtils.add(2, 3);
        Assertions.assertEquals(6, result);
    }
}

