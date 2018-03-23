package behavioral.command.commands;

import behavioral.command.receiver.SchwarzWeissDrucker;

public class SchwarzWeissDruckbefehl implements DruckBefehl {
    private SchwarzWeissDrucker drucker;

    public SchwarzWeissDruckbefehl(SchwarzWeissDrucker drucker) {
        this.drucker = drucker;
    }

    public void ausfuehren(String dokument){
        drucker.konfigurieren();
        drucker.drucken(dokument);
    }
}
