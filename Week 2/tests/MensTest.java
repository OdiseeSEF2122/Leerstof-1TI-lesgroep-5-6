import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MensTest {

    private static Mens mens;

    /*@BeforeAll
    public static void beforeAll(){
        mens = new Mens("Baetens", "Jens", 30, true);
    }*/

    @BeforeEach
    public void beforeEach(){
        mens = new Mens("Baetens", "Jens", 30, true);
    }

    @Test
    public void verjaar_When30_AgeBecomes31(){
        mens.verjaar();

        assertEquals(mens.getLeeftijd(), 31);
    }

    @Test
    public void ctor_valuesAreSet(){
        assertEquals(mens.getLeeftijd(), 30);
    }
}