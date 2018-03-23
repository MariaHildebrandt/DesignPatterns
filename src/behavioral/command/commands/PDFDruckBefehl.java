package behavioral.command.commands;

import behavioral.command.receiver.PDFDrucker;

class PDFDruckBefehl implements DruckBefehl {
    private PDFDrucker drucker;

    //Der Befehl wird seinem Zieldrucker bei Instanziierung bekannt gemacht
    public PDFDruckBefehl(PDFDrucker drucker) {
        this.drucker = drucker;
    }

    public void ausfuehren(String dokument) {
        drucker.speichern(dokument);
    }
}