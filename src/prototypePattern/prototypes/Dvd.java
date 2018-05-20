package prototypePattern.prototypes;

public class Dvd extends Item {

    private String title;

    public Dvd(String title){
        type = "DVD";
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void makeSth(){
        System.out.println("Hello im a DVD");
    }
}
