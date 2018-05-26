package compositePattern;

import compositePattern.composites.ReportComponent;

import java.util.Iterator;

public class Analyst {

    ReportComponent allReportComponents;

    public Analyst(ReportComponent allReportComponents) {
        this.allReportComponents = allReportComponents;
    }

    public void printOut() {
        allReportComponents.printOut();
    }

    public void showAllCriticalReports() {
        Iterator iterator = allReportComponents.createIterator();

        System.out.println("All critcal Reports 2018: ");
        while(iterator.hasNext()) {
            ReportComponent reportComponent = (ReportComponent) iterator.next();

            try {
                if(reportComponent.isCritical()) {
                    reportComponent.printOut();
                }
            } catch (UnsupportedOperationException e) {
                System.out.println("..");
            }
        }
    }


}
