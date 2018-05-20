package beobachterPattern;

import beobachterPattern.observers.Abonnent;
import beobachterPattern.observers.StadtratBeobachter;
import beobachterPattern.observers.TierheimBeobachter;
import beobachterPattern.subjects.NeumarkterNachrichten;

public class Client {

    public static void main(String[] args){

        Abonnent tierheim = new TierheimBeobachter();
        Abonnent stadtRat = new StadtratBeobachter();

        NeumarkterNachrichten nachrichten = new NeumarkterNachrichten();

        Zeitung wochenschau = new Zeitung("wochenschau");

        nachrichten.addAbonnent(tierheim);
        nachrichten.addAbonnent(stadtRat);

        nachrichten.setZeitung(wochenschau);

        nachrichten.notifyAbonnent(wochenschau);

        nachrichten.setZeitung(new Zeitung("Tagblatt"));

    }
}
