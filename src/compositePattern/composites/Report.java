package compositePattern.composites;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Report extends ReportComponent {

    private List<ReportComponent> reportComponentList = new ArrayList<>();
    private String name;
    private String date;
    private Iterator<ReportComponent> iterator = null;

    public Report(String name, String date) {
        this.name = name;
        this.date = date;
    }

    @Override
    public void addReport(ReportComponent reportComponent) {
        reportComponentList.add(reportComponent);
    }

    @Override
    public void deleteReport(ReportComponent reportComponent) {
        reportComponentList.remove(reportComponent);
    }

    @Override
    public ReportComponent getChildReport(int i) {
        return reportComponentList.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    //get some nice Iterator
    @Override
    public Iterator<ReportComponent> createIterator() {
        if(iterator == null) {
            iterator = new CriticalIterator(reportComponentList.iterator());
        }
        return iterator;
    }

    //external Iterator
    @Override
    public void printOut() {

    }



    //internal Iterator
    /*
    @Override
    public void printOut() {
        System.out.println(" " + getName() + " " +getDate());
        System.out.println("____________________");

        Iterator<ReportComponent> iterator = reportComponentList.iterator();
        while(iterator.hasNext()) {
            ReportComponent reportComponent = iterator.next();
            reportComponent.printOut();
        }
    }*/

    public List<ReportComponent> getReportComponentList() {
        return reportComponentList;
    }

    public String getDate() {
        return date;
    }
}
