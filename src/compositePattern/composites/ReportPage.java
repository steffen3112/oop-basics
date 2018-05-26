package compositePattern.composites;

import java.util.Iterator;

public class ReportPage extends ReportComponent {

    private String name;
    private String inspectionPart;
    private boolean critical;

    public ReportPage(String name, String inspectionPart, boolean critical) {
        this.name = name;
        this.inspectionPart = inspectionPart;
        this.critical = critical;
    }

    @Override
    public void printOut() {
        System.out.print(" " + getName());
        if(isCritical()) {
            System.out.print("***critical***");
        } else {
            System.out.print("---ok---");
        }
        System.out.println(", " + getInspectionPart());
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Iterator<ReportComponent> createIterator() {
        return new NullIterator();
    }

    public String getInspectionPart() {
        return inspectionPart;
    }

    public boolean isCritical() {
        return critical;
    }


}
