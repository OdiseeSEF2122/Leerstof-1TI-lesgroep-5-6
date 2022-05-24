package composition;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalTime;

public class BusTraject {
    private List<Stop> stops = new ArrayList<>();
    /*Een stop kan enkel worden gemaakt en vernietigd door het traject*/
    public void voegStopToe(String halte,LocalTime tijdstip) {
        Stop nieuweStop=new Stop(halte,tijdstip);
        stops.add(nieuweStop);
    }
    public void verwijderStop(String halte) {
        //TODO implement
    }

    public void voegStopToe(Stop nieuweStop) {
        stops.add(nieuweStop);
    }

    public static void main(String[] args) {
        BusTraject myBusTraject=new BusTraject();
        myBusTraject.voegStopToe("Bommerskonte",LocalTime.of(11,11,11));
    }

}
record Stop(String halte,LocalTime tijdstip) {
}
