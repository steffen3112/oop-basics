package iteratorPattern.Collections;

import java.util.Iterator;
import java.util.List;

public class BookCollection extends ReadableCollection {

    //~ Instance fields
    //=================================================================


    private List<String> bookList;


    //~ Constructors
    //=================================================================

    public BookCollection(List<String> bookList) {
        this.bookList = bookList;
    }


    //~ Overrides
    //=================================================================



    public Iterator createIterator() {
        return bookList.iterator();
    }




    //~ Methods
    //=================================================================


}
