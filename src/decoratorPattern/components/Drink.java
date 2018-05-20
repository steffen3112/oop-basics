package decoratorPattern.components;

public abstract class Drink {

    //~Instance Fields
    //=============================================================
    protected String description = "Hier kommt die Beschreibung";
    private double price;

    //~Getters & Setters
    //=============================================================
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //~Methods
    //=============================================================
    public abstract double calculatePrice();

}
