package behavioral.command.invoker;

import behavioral.command.commands.DruckBefehl;

public class Invoker {
    private DruckBefehl druckBefehl;

    public Invoker(DruckBefehl druckBefehl) {
        this.druckBefehl = druckBefehl;
    }

    public void setDruckBefehl(DruckBefehl druckBefehl){
        this.druckBefehl = druckBefehl;
    }

    public void druckAusloesen(String dokument){
        druckBefehl.ausfuehren(dokument);
    }
}
