package decoratorPattern.components;

public class Coffee extends Drink {

    private static final String DESCRIPTION = "Malaysian Coffee-Beans, roasted 2 month";
    private static final double PRICE = 1.3;
    @Override
    public void setDescription(String description) {
        super.setDescription(DESCRIPTION);
    }

    public Coffee(){
        description = DESCRIPTION;

    }

    @Override
    public double calculatePrice() {
        return PRICE;
    }
}
