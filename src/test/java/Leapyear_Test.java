import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Leapyear_Test {

    @Test
    public void when_divided_by_4_and_not_100() {assertEquals( true, Leapyear.isLeapYear(1916));}

    @Test
    public void when_divided_by_400() {assertEquals(true, Leapyear.isLeapYear(2000));
    }

    @Test
    public void when_not_divided_by_4() {assertEquals(false, Leapyear.isLeapYear(1807));
    }

    @Test
    public void when_not_divided_by_400() {assertEquals(false, Leapyear.isLeapYear(2057));
    }

}
