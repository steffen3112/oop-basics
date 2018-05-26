package iteratorPattern;

import iteratorPattern.Collections.BookCollection;
import iteratorPattern.Collections.MagazinCollection;
import iteratorPattern.Collections.ReadableCollection;
import iteratorPattern.Users.BookSeller;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        String[] magazines = {"Mag1 ", "Mag2 " , "Mag3 " , "Mag4 " , "Magazine5"};
        List<String> books = new ArrayList<>();
        books.add("Book1");
        books.add("Book2");
        books.add("Book3");


        MagazinCollection magazinCollection = new MagazinCollection(magazines);
        BookCollection bookCollection = new BookCollection(books);

        List<ReadableCollection> readableCollections = new ArrayList<>();
        readableCollections.add(magazinCollection);
        readableCollections.add(bookCollection);

        BookSeller bookSeller = new BookSeller(readableCollections);

        bookSeller.showAllReadable();

    }

}
