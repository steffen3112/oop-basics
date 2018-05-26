package compositePattern.composites;

import java.util.Iterator;

public abstract class ReportComponent {

    public void addReport(ReportComponent reportComponent) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    public void deleteReport(ReportComponent reportComponent) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    public ReportComponent getChildReport(int number) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    public String getName() {
        throw new UnsupportedOperationException("Operation not supported");
    }

    public void printOut() {
        throw new UnsupportedOperationException("Operation not supported");
    }

    public Iterator<ReportComponent> createIterator() {
        throw new UnsupportedOperationException("Operation not supported");
    }

    public boolean isCritical() {
        throw new UnsupportedOperationException("Operation not supported");
    }




}
