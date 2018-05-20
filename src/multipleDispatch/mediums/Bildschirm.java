package multipleDispatch.mediums;

import multipleDispatch.grafics.Grafik;

public class Bildschirm implements Ausgabemedium {

    @Override
    public void ausgeben(Grafik grafik) {
        grafik.ausgebenAufBildschirm(this);
    }
}
