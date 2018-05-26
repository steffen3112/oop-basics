package iteratorPattern.Users;

import iteratorPattern.Collections.ReadableCollection;

import java.util.List;

public class BookSeller {


    //~ Instance fields
    //=================================================================

    //TODO: abstract into "ReadableCollection"
    private List<ReadableCollection> readableCollectionList;


    //~ Constructors
    //=================================================================

    public BookSeller(List<ReadableCollection> readableCollectionList) {
        this.readableCollectionList = readableCollectionList;
    }


    //~ Methods
    //=================================================================

    public void showAllReadable() {

        java.util.Iterator<ReadableCollection> iterator = readableCollectionList.iterator();
        while(iterator.hasNext()) {
            ReadableCollection readableCollection = iterator.next();
            prettyPrint(readableCollection.createIterator());
        }

    }

    private void prettyPrint(java.util.Iterator iterator) {

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }


}
