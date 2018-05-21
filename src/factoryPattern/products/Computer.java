package factoryPattern.products;

public abstract class Computer {

    String vendor;

    public String getVendor() {
        return vendor;
    }

    public Computer(String vendor){
        this.vendor = vendor;
    }

    public abstract void play();
}
