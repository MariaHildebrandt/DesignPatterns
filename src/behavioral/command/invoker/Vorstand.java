package behavioral.command.invoker;

import behavioral.command.commands.DruckBefehl;

public class Vorstand extends Invoker{
    public Vorstand(DruckBefehl druckBefehl) {
        super(druckBefehl);
    }
}
