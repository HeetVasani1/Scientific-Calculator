import org.cal.Main;
import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {
    private static final double DELTA = 1e-15;
    Main calculator = new Main();

    @Test
    public void factorialTruePositive() {
        assertEquals("Finding factorial of a number for True Positive", 6, Main.factorial(3), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 720, Main.factorial(6), DELTA);
    }

    @Test
    public void factorialTrueNegative() {
        assertNotEquals("Finding factorial of a number for True Negative", 69, Main.factorial(5), DELTA);
        assertNotEquals("Finding factorial of a number for True Negative", 42, Main.factorial(10), DELTA);
    }

    @Test
    public void powerTruePositive() {
        assertEquals("Finding power for True Positive", 32, Main.power(2, 5), DELTA);
        assertEquals("Finding power for True Positive", 81, Main.power(9, 2), DELTA);
    }

    @Test
    public void powerTrueNegative() {
        assertNotEquals("Finding power for True Negative", 69, Main.power(2, 2), DELTA);
        assertNotEquals("Finding power for True Negative", -69420, Main.power(-2, 20), DELTA);
    }

    @Test
    public void logTruePositive() {
        assertEquals("Finding natural log for True Positive", 0, Main.log(1), DELTA);
        assertEquals("Finding natural log for True Positive", 5.703782474656201, Main.log(300), DELTA);
    }

    @Test
    public void logTrueNegative() {
        assertNotEquals("Finding natural log for True Negative", 69, Main.log(2.4), DELTA);
        assertNotEquals("Finding natural log for True Negative", 420, Main.log(2.1), DELTA);
    }

    @Test
    public void sqrootTruePositive() {
        assertEquals("Finding square root for True Positive", 11, Main.squareroot(121), DELTA);
        assertEquals("Finding square root for True Positive", 121, Main.squareroot(14641), DELTA);
    }

    @Test
    public void sqrootTrueNegative() {
        assertNotEquals("Finding square root for True Negative", 69, Main.squareroot(3), DELTA);
        assertNotEquals("Finding square root for True Negative", -42, Main.squareroot(4), DELTA);
    }

}
