package compositePattern.composites;

import java.util.Iterator;

public class NullIterator implements Iterator<ReportComponent> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public ReportComponent next() {
        return null;
    }
}
