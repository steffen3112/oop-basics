package compertatorExample.domainObj;

public class FootballPlayer {

    private Skill skill;
    private String name;
    private int age;

    public FootballPlayer(Skill skill, int age, String name){
        this.skill = skill;
        this.age = age;
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String
    toString() {
        return "FootballPlayer{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                ", SkillSet=" + skill.sumOfSkillPoints() +
                '}';
    }
}
