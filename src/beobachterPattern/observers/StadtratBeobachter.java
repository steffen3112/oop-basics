package beobachterPattern.observers;

import beobachterPattern.Zeitung;

public class StadtratBeobachter implements Abonnent {
    @Override
    public void update(Zeitung zeitung) {
        System.out.println("Stadtrat hat die Zeitung " + zeitung.getTitle() + " erhalten");
    }
}
