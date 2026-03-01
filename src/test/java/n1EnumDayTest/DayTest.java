package n1EnumDayTest;

import n1EnumDay.Day;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DayTest {
    @Test
    void mondayIsWorkday() {
        assertFalse(Day.MONDAY.isWeekend());
    }

    @Test
    void fridayIsWorkday() {
        assertFalse(Day.FRIDAY.isWeekend());
    }

    @Test
    void saturdayIsWeekend() {
        assertTrue(Day.SATURDAY.isWeekend());
    }

    @Test
    void sundayIsWeekend() {
        assertTrue(Day.SUNDAY.isWeekend());
    }

    @Test
    void allWorkdaysAreNotWeekend() {
        Day[] workdays = {Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY};
        for (Day day : workdays) {
            assertFalse(day.isWeekend(), day + " should be a workday.");
        }
    }
}
