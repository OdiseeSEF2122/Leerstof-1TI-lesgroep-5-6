import java.util.ArrayList;

/**
 * Dit is de algemene klasse voor een ziekenhuis
 * @author jens.baetens3
 * @version 1.0
 */
public class Ziekenhuis {

    /**
     * Deze property houdt alle actieve werknemers bij
     * @see Mens
     */
    public ArrayList<Mens> werknemers;

    /**
     * Deze methode dient om een verjaardagsfeestje te organiseren
     * <strong>Let op: officieel verjaart de werknemer bij het houden van een feestje</strong>
     * @param mens
     */
    public void maakVerjaardagsfeest(Mens mens){
        mens.verjaar();
    }

}
