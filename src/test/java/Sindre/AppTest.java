package Sindre;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    @Test
    public void evaluatesExpression() {
        Calculator calculator = new Calculator();
        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
    }



    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }
}
