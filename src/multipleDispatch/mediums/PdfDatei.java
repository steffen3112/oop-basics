package multipleDispatch.mediums;

import multipleDispatch.grafics.Grafik;

public class PdfDatei implements Ausgabemedium {

    @Override
    public void ausgeben(Grafik grafik) {
        grafik.ausgebenAlsPdfDatei(this);
    }
}
