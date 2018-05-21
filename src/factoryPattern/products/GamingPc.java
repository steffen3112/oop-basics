package factoryPattern.products;

public class GamingPc extends Computer {

    public GamingPc(String vendor) {
        super(vendor);
    }

    @Override
    public void play() {
        System.out.println("Playing on " + this.getVendor() + " Gaming PC");
    }
}
