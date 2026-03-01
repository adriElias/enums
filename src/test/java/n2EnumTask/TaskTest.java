package n2EnumTask;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {
    private String captureOutput(Task task) {

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        task.showBehavior();

        System.setOut(System.out); //restore
        return out.toString().trim();
    }

    @Test
    void lowLevelShowsCorrectMessage() {
        Task task = new Task(Level.LOW);
        String output = captureOutput(task);
        assertTrue(output.contains("practise 30 ball throws"));
    }

    @Test
    void mediumLevelShowsCorrectMessage() {
        Task task = new Task(Level.MEDIUM);
        String output = captureOutput(task);
        assertTrue(output.contains("practice the overhead serve"));
    }

    @Test
    void highLevelShowsCorrectMessage() {
        Task task = new Task(Level.HIGH);
        String output = captureOutput(task);
        assertTrue(output.contains("practice the spike"));
    }

    @Test
    void lowColorIsGreen() {
        assertEquals("Green", Level.LOW.getColor());
    }

    @Test
    void mediumColorIsYellow() {
        assertEquals("Yellow", Level.MEDIUM.getColor());
    }

    @Test
    void highColorIsRed() {
        assertEquals("Red", Level.HIGH.getColor());
    }

    @Test
    void allLevelsHaveColor() {
        for (Level level : Level.values()) {
            assertNotNull(level.getColor());
            assertFalse(level.getColor().isBlank());
        }
    }

    @Test
    void parsesHighCorrectly() {
        assertEquals(Level.HIGH, ParseLevel.parseLevel("HIGH"));
    }

    @Test
    void parsesLowercaseInput() {
        assertEquals(Level.LOW, ParseLevel.parseLevel("low"));
    }

    @Test
    void parsesMixedCaseInput() {
        assertEquals(Level.MEDIUM, ParseLevel.parseLevel("Medium"));
    }

    @Test
    void returnsNullForInvalidValue() {
        assertNull(ParseLevel.parseLevel("CRITICAL"));
    }

    @Test
    void returnsNullForEmptyString() {
        assertNull(ParseLevel.parseLevel(""));
    }
}
