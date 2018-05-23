package commandPattern.command;

import commandPattern.receiver.Soldier;

public class FightCommand implements Commands {

    //~ Instance fields
    //==========================================================

    private Soldier soldier;

    //~ Constructors
    //==========================================================

    public FightCommand(Soldier soldier) {
        this.soldier = soldier;
    }


    //~ Overrides
    //==========================================================

    @Override
    public void execute() {
        this.soldier.fight();
    }
}
