package singletonPattern.singletons;

public class Singleton {

    private static Singleton singleton;

    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    private Singleton(String name, String description){
        this.name = name;
        this.description = description;
    }

    public synchronized static Singleton getSingleton(String name, String description){
        if(singleton == null){
            return new Singleton(name, description);
        }
        else return singleton;
    }

    public void doSomething(){
        System.out.println("Name: " + this.getName() + "\nDescription: " + this.getDescription());
    }
}
