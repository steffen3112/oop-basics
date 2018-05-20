package multipleDispatch.grafics;

import multipleDispatch.mediums.Ausgabemedium;

public class VectorGrafik implements Grafik {
    @Override
    public void ausgebenAlsPdfDatei(Ausgabemedium medium) {

        System.out.println("printing a  Vectors PDF File");
    }

    @Override
    public void ausgebenAufBildschirm(Ausgabemedium medium) {

        System.out.println("printing a Vector on Screen");

    }
}
