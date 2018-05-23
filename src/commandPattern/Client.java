package commandPattern;

import commandPattern.command.BattleCommand;
import commandPattern.command.Commands;
import commandPattern.command.FightCommand;
import commandPattern.invoker.Commander;
import commandPattern.receiver.Soldier;

public class Client {

    public static void main(String[] args) {

        //Soldiers
        Soldier soldier1 = new Soldier("Rambo", 120);
        Soldier soldier2 = new Soldier("Clerk", 220);
        Soldier soldier3 = new Soldier("Warren", 34);
        Soldier soldier4 = new Soldier("Jerk", 70);

        //Commands
        FightCommand command1 = new FightCommand(soldier1);
        FightCommand command2 = new FightCommand(soldier2);
        FightCommand command3 = new FightCommand(soldier3);
        FightCommand command4 = new FightCommand(soldier4);

        //Batch Command
        BattleCommand batchCommand = new BattleCommand();
        batchCommand.addCommand(command1);
        batchCommand.addCommand(command2);
        batchCommand.addCommand(command3);
        batchCommand.addCommand(command4);

        //Invoker
        Commander myCommander = new Commander("James");
        myCommander.setCommand(command1);


        //Invoker 2
        Commander myCommander2 = new Commander("Armenius");
        myCommander2.setCommand(batchCommand);

        //Execute commands
        myCommander.makeCommand();
        myCommander2.makeCommand();


    }
}
