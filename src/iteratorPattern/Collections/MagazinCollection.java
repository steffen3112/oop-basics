package iteratorPattern.Collections;

import iteratorPattern.Iterators.Iterator;
import iteratorPattern.Iterators.MagazinCollectionIterator;

public class MagazinCollection extends ReadableCollection{


    //~ Instance fields
    //=================================================================

    private String[] magazines;



    //~ Constructors
    //=================================================================


    public MagazinCollection(String[] magazines) {
        this.magazines = magazines;
    }


    //~ Overrides
    //=================================================================
    @Override
    public Iterator createIterator() {
        return new MagazinCollectionIterator(magazines);
    }
}
