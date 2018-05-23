package commandPattern.receiver;

public class Soldier {

    //~ Instance fields
    //==========================================================
    private String name;
    private double health;

    //~ Constructors
    //==========================================================
    public Soldier(String name, double health) {
        this.name = name;
        this.health = health;
    }

    //~ Methods
    //==========================================================

    public void fight() {
        health -= 20;
        System.out.println("Fighting!!!! \n Health decreased: " + this.health);
        if(this.health <= 40) {
            System.out.println("critical situation!! " + this.health);
        } else if( this.health <= 0 ){
            System.out.println("Died x|");
        }
    }

    public void takeBreak() {
        health += 10;
        System.out.println("That feels good. \n Health increased " + this.health);
    }

}
