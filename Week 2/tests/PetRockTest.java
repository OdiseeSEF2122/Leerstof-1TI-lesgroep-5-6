import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetRockTest {

    @Test
    public void getNaam_AfterCtor_NameIsSet(){
        // Naamgeving van methode is belangrijk, steeds drie delen
        // welke methode er getest wordt, de beginsituatie beschrijven en wat wordt er verwacht

        PetRock rock = new PetRock("Rocky");

        String result = rock.getNaam();

        assertTrue(result == "Rocky");
    }

    @Test
    public void getNaam_AfterCtor_NameIsSet2(){
        // Naamgeving van methode is belangrijk, steeds drie delen
        // welke methode er getest wordt, de beginsituatie beschrijven en wat wordt er verwacht

        PetRock rock = new PetRock("Rocky");

        String result = rock.getNaam();

        assertEquals(result, "Rocky");
    }

    @Test
    public void isHappy_AfterCtor_IsUnhapppy(){

        PetRock rock = new PetRock("Rocky");

        boolean result = rock.isHappy();

        assertFalse(result);
    }

    @Test
    public void play_AfterPlay_IsHappy(){
        // Arrange, Given (begin situatie instellen)
        PetRock rock = new PetRock("Rocky");

        // Act, When (wat wordt er uitgevoerd/ wat wordt er getest)
        rock.play();

        // Assert, Then (wat wordt er gecontroleerd)
        assertTrue(rock.isHappy());
    }
}