/*Dit is een probeersel! Ik ben nog bezig met het uitzoeken hoe ik tests kan schrijven icm scanners en  print ststaments in de methodes */

package week1.LED;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LEDTest {

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    public void testGetColorValue() {
        // Arrange
        String input = "255 0 0\n";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

        // Act
        LED strip = new LED();
        String result = strip.getColorValue();

        // Assert
        assertEquals("255 0 0", result.trim());
    }

    @Test
    public void testSetLEDWithValidColor() {
        // Arrange
        String input = "255 0 0\n";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

        // Act
        LED strip = new LED();
        boolean result = strip.setLED();

        // Assert
        assertTrue(result);
        assertEquals("Rood", testOut.toString().trim());
    }
}

