import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    private Queue queue;

    @BeforeEach
    void setUp() {
        queue = new Queue();
    }

    @Test
    public void store_withInteger_elementStored(){
        // Arrange
        Integer element = 5;

        // Act
        queue.store(5);

        // Assert
    }

    @Test
    public void release_withStoredElement_ReleaseTheSameElement(){
        // Arrange
        queue.store(5);

        // Act
        Integer result = queue.release();

        // Assert
        assertEquals(5, result);
    }

    @Test
    public void release_WithoutStoredElement_ReleaseNull(){
        // Arrange
        queue.store(5);
        queue.release();

        // Act
        Integer result = queue.release();

        // Assert
        assertEquals(null, result);
    }

    @Test
    public void storeRelease_WithMultipleElement_ReleaseInFIFOOrder(){
        // Arrange
        queue.store(5);
        queue.store(10);
        queue.store(15);

        // Act

        // Assert
        assertEquals(5, queue.release());
        assertEquals(10, queue.release());
        assertEquals(15, queue.release());
    }

    @Test
    public void Ctor_DefaultMaxSize_CanStore5Elements(){
        // Arrange
        queue.store(5);
        queue.store(10);
        queue.store(15);
        queue.store(20);
        queue.store(25);
        queue.store(30);

        // Act

        // Assert
        assertEquals(5, queue.release());
        assertEquals(10, queue.release());
        assertEquals(15, queue.release());
        assertEquals(20, queue.release());
        assertEquals(25, queue.release());
        assertEquals(null, queue.release());
    }

    @Test
    public void Ctor_MaxSize3_CanStore5Elements(){
        // Arrange
        queue = new Queue(3);
        queue.store(5);
        queue.store(10);
        queue.store(15);
        queue.store(20);

        // Act

        // Assert
        assertEquals(5, queue.release());
        assertEquals(10, queue.release());
        assertEquals(15, queue.release());
        assertEquals(null, queue.release());
    }
}