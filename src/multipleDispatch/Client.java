package multipleDispatch;

import multipleDispatch.grafics.BitmapGrafik;
import multipleDispatch.grafics.Grafik;
import multipleDispatch.grafics.VectorGrafik;
import multipleDispatch.mediums.Ausgabemedium;
import multipleDispatch.mediums.Bildschirm;
import multipleDispatch.mediums.PdfDatei;

public class Client {

    public static void print(Grafik grafik, Ausgabemedium ausgabemedium){
        ausgabemedium.ausgeben(grafik);
    }

    public static void main(String[] args){
        Grafik graficBitmap =  new BitmapGrafik();
        Grafik graficVector = new VectorGrafik();

        Ausgabemedium screen = new Bildschirm();
        Ausgabemedium pdf = new PdfDatei();

        print(graficBitmap, screen);
        print(graficVector, screen);
        print(graficBitmap, pdf);
        print(graficVector, pdf);
    }
}
