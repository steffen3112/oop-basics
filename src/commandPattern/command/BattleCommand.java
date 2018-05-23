package commandPattern.command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BattleCommand implements Commands {


    //~ Instance fields
    //==========================================================

    private List<Commands> commands;

    //~ Constructors
    //==========================================================

    public BattleCommand() {
        this.commands = new ArrayList<>();
    }

    //~ Overrides
    //==========================================================

    @Override
    public void execute() {
        Iterator iterator = commands.iterator();

        while (iterator.hasNext()) {
            Commands command = (Commands) iterator.next();

            command.execute();

        }
    }

    public void addCommand(Commands command) {
        this.commands.add(command);
    }
}
