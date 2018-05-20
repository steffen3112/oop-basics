package beobachterPattern.subjects;

import beobachterPattern.Zeitung;

public class NeumarkterNachrichten extends  AbstrakteNachrichten {

    private Zeitung zeitung;

    public Zeitung getZeitung() {
        return zeitung;
    }

    public void setZeitung(Zeitung zeitung) {
        this.zeitung = zeitung;
        notifyAbonnent(zeitung);
    }

}
