package behavioral.command.commands;

import behavioral.command.receiver.NadelDrucker;

public class NadelDruckBefehl implements DruckBefehl {
    private NadelDrucker drucker;

    //Der Befehl wird seinem Zieldrucker bei Instanziierung bekannt gemacht
    public NadelDruckBefehl(NadelDrucker drucker) {
        this.drucker = drucker;
    }

    public void ausfuehren(String dokument) {
        drucker.umstaendlichKonfigurieren();
        drucker.drucken(dokument);
    }
}