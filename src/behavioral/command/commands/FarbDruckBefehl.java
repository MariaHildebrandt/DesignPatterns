package behavioral.command.commands;

import behavioral.command.receiver.FarbDrucker;

public class FarbDruckBefehl implements DruckBefehl {
    private FarbDrucker drucker;

    //Der Befehl wird seinem Zieldrucker bei Instanziierung bekannt gemacht
    public FarbDruckBefehl(FarbDrucker drucker) {
        this.drucker = drucker;
    }

    public void ausfuehren(String dokument) {
        drucker.drucken(dokument);
    }
}
