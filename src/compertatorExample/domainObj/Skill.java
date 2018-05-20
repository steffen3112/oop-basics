package compertatorExample.domainObj;

public class Skill {

    private int strength;
    private int velocity;
    private int experience;

    public Skill(int strength, int velocity, int experience) {
        this.strength = strength;
        this.velocity = velocity;
        this.experience = experience;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int sumOfSkillPoints(){
        return this.experience + this.strength + this.velocity;
    }
}
