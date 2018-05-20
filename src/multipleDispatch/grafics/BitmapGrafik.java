package multipleDispatch.grafics;

import multipleDispatch.mediums.Ausgabemedium;

public class BitmapGrafik implements Grafik{

    public static void main(String args){
        System.out.println("run");
    }

    @Override
    public void ausgebenAlsPdfDatei(Ausgabemedium medium) {


        System.out.println("printing a Bitmap PDF File");

    }

    @Override
    public void ausgebenAufBildschirm(Ausgabemedium medium) {

        System.out.println("printing a Bitmap on Screen");

    }
}