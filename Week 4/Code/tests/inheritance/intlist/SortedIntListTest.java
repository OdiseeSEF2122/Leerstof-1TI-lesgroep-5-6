package inheritance.intlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedIntListTest {
    private SortedIntList list;

    private void addValues(){
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);
        list.add(8);
        list.add(9);
    }

    @BeforeEach
    void setUp() {
        list = new SortedIntList();
    }

    @Test
    public void add_AfterCtor_NoError(){
        // Arrange

        // Act
        list.add(5);

        // Assert
    }

    @Test
    public void remove_afterCtor_ReturnsNull(){
        // Arrange

        // Act
        Integer result = list.remove(5);

        // Assert
        assertNull(result);
    }

    @Test
    public void remove_withElementsIndexToLarge_ReturnsNull(){
        // Arrange
        addValues();

        // Act
        Integer result = list.remove(40);

        // Assert
        assertNull( result);
    }

    @Test
    public void remove_withElements_ReturnsCorrectElement(){
        // Arrange
        addValues();

        // Act
        Integer result = list.remove(4);

        // Assert
        assertEquals(4, result);
    }


    @Test
    public void findMin_withElements_ReturnsCorrectElement(){
        // Arrange
        addValues();

        // Act
        Integer result = list.findMin();

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void findMin_withoutElements_ReturnsNull(){
        // Arrange

        // Act
        Integer result = list.findMin();

        // Assert
        assertNull( result);
    }
}