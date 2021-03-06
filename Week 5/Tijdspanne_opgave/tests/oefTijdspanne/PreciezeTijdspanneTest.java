package oefTijdspanne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PreciezeTijdspanneTest {

    @Test
    void bijTellen_GewoneTijdspanne_GeeftCorrecteTijdspanne() {
        PreciezeTijdspanne t1=new PreciezeTijdspanne(2,3);
        Tijdspanne t2=new Tijdspanne(3);

        t1.bijTellen(t2);
        assertEquals(5,t1.getMinuten());
    }

    @Test
    void bijTellen_preciezeTijdspanne2en3_Geeft5() {
        //TODO implement
        PreciezeTijdspanne t1=new PreciezeTijdspanne(2, 3);
        PreciezeTijdspanne t2=new PreciezeTijdspanne(3, 2);

        t1.bijTellen(t2);
        assertEquals(5,t1.getMinuten());
        assertEquals(5,t1.getSeconden());
    }


}