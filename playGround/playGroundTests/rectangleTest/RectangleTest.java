package rectangleTest;

import org.junit.jupiter.api.Test;
import rectangle.NewRectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    @Test
    public void test_thatRectanglecanCalculatePeremeterOfTrinangle() {
        NewRectangle myRectangle = new NewRectangle(7, 8);
        assertEquals(30,myRectangle.perimeter());
    }

}
