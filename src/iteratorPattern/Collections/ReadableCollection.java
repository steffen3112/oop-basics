package iteratorPattern.Collections;

import java.util.List;

public abstract class ReadableCollection {

    //Using simple String, but can be replaced by any own datastructure (e.g. Student, Animal, ViewModel,...)
    List<String> readableList;

    public abstract java.util.Iterator createIterator();
}
