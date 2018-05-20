package beobachterPattern.observers;

import beobachterPattern.Zeitung;

public interface Abonnent {

    public void update(Zeitung zeitung);
}
