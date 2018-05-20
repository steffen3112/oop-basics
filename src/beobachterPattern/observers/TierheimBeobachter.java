package beobachterPattern.observers;

import beobachterPattern.Zeitung;

public class TierheimBeobachter implements Abonnent {
    @Override
    public void update(Zeitung zeitung) {
        System.out.println("Tierheim hat die Zeitung " + zeitung.getTitle() + " erhalten");
    }
}
