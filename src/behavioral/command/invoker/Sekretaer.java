package behavioral.command.invoker;

import behavioral.command.commands.DruckBefehl;

public class Sekretaer extends Invoker{
    public Sekretaer(DruckBefehl druckBefehl) {
        super(druckBefehl);
    }
}
