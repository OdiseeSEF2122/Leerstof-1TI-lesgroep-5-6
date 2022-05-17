package encapsulation.rectangle;

import org.junit.jupiter.api.Test;
import org.w3c.dom.css.Rect;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    public void getArea_WhenLengthChanged_AreaUpdated(){
        // Arrange
        Rectangle rectangle = new Rectangle(5, 10);
        rectangle.setLength(5);

        // Act
        double area = rectangle.getArea();

        // Assert
        assertEquals(25, area);
    }
}