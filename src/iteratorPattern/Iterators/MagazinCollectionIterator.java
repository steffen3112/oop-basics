package iteratorPattern.Iterators;

public class MagazinCollectionIterator implements Iterator {

    //~ Instance fields
    //=================================================================

    String[] magazinCollection;
    private int position = 0;


    //~ Constructors
    //=================================================================

    public MagazinCollectionIterator(String[] magazinCollection) {
        this.magazinCollection = magazinCollection;
    }

    //~ Iterator
    //=================================================================

    @Override
    public boolean hasNext() {
        if(position >= magazinCollection.length || magazinCollection[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        String magazin = magazinCollection[position];
        position = position +1;
        return magazin;
    }
}
