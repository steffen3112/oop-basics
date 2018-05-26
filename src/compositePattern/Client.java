package compositePattern;

import compositePattern.composites.Report;
import compositePattern.composites.ReportComponent;
import compositePattern.composites.ReportPage;

public class Client {
    /*
    This example shows how the composite Pattern can be implemented. The Use-Case is, that a Analyst wants to see all
    reports from his company. Reports itself consists of several Pages, but also "Subreports" (=Reports).
    The "Report-tree" is traversed by a CritcalIterator to filter all the report pages with the flag critcal == true
     */

    public static void main(String[] args) {

        ReportComponent reportComponent1 = new ReportPage("SAP Report", "Screwdriver", false);
        ReportComponent reportComponent2 = new ReportPage("SAP Report", "Hammer", true);
        ReportComponent reportComponent3 = new ReportPage("SAP Report", "Nail", false);
        ReportComponent reportComponent4 = new ReportPage("SAP Report", "Screwdriver v2", true);

        ReportComponent report  = new Report("Craftsmen Report", "26-05-2018");
        ReportComponent report2  = new Report("Report", "26-05-2018");
        report.addReport(reportComponent1);
        report.addReport(reportComponent2);
        report.addReport(reportComponent3);
        report.addReport(reportComponent4);

        report2.addReport(reportComponent2);

        report.addReport(report2);

        Analyst analyst = new Analyst(report);
        analyst.showAllCriticalReports();


    }

}
