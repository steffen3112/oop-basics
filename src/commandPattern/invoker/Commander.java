package commandPattern.invoker;

import commandPattern.command.Commands;

public class Commander {

    //~ Instance fields
    //==========================================================

    private Commands command;
    private String name;

    //~ Constructors
    //==========================================================

    public Commander(String name) {
        this.name = name;
    }

    //~ Methods
    //==========================================================

    public void makeCommand() {
        System.out.println(this.name + " starting the Game");
        this.command.execute();
    }


    //~ Setters
    //==========================================================

    public void setCommand(Commands command) {
        this.command = command;
    }
}
