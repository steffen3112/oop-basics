package commandPattern.command;

import commandPattern.receiver.Soldier;

public class RemedyCommand implements Commands {

    //~ Instance fields
    //==========================================================

    private Soldier soldier;

    //~ Constructors
    //==========================================================

    public RemedyCommand(Soldier soldier) {
        this.soldier = soldier;
    }

    //~ Overrides
    //==========================================================

    @Override
    public void execute() {
        this.soldier.takeBreak();
    }
}
