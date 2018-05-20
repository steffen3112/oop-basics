package prototypePattern.prototypes;

public abstract class Item implements Cloneable {

    // Instance Variables=======================================

    private String id;
    protected String type;
    private int price;

    // Getter & Setter==========================================

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // Methods==================================================

    public Object clone(){
        Object clone = null;

        try{
            clone = super.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }

}
