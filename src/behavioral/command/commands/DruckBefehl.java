package behavioral.command.commands;

public interface DruckBefehl {
    //jeder Befehl kapselt die Logik zur Ausführung
    //sowie den Zieldrucker

    public void ausfuehren(String dokument);
}
