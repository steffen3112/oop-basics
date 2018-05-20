package multipleDispatch.grafics;

import multipleDispatch.mediums.Ausgabemedium;

public interface Grafik {

    public void ausgebenAlsPdfDatei(Ausgabemedium medium);
    public void ausgebenAufBildschirm(Ausgabemedium medium);
    
}