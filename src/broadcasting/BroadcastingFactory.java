package broadcasting;

import java.util.ArrayList;

public interface BroadcastingFactory {    //AbstractFactory
    ArrayList<Interview> createPaidInterview();
    ArrayList<Advertising> createPaidAdvertising();
    ArrayList<Song> createNoPaid();
}
