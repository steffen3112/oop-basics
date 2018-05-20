package beobachterPattern.subjects;

import beobachterPattern.Zeitung;
import beobachterPattern.observers.Abonnent;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstrakteNachrichten {

    private List<Abonnent> abonnentenList =  new ArrayList<>();

    public void addAbonnent(Abonnent abonnent){
        abonnentenList.add(abonnent);
    }

    public void removeAbonnent(Abonnent abonnent){
        abonnentenList.remove(abonnent);
    }

    public void notifyAbonnent(Zeitung zeitung){
        for(Abonnent abonnent : abonnentenList){
            abonnent.update(zeitung);
        }
    }


}
