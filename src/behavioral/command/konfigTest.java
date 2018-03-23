package behavioral.command;

import behavioral.command.commands.FarbDruckBefehl;
import behavioral.command.commands.SchwarzWeissDruckbefehl;
import behavioral.command.invoker.Invoker;
import behavioral.command.invoker.Sekretaer;
import behavioral.command.receiver.FarbDrucker;
import behavioral.command.receiver.NadelDrucker;
import behavioral.command.receiver.PDFDrucker;
import behavioral.command.receiver.SchwarzWeissDrucker;

public class konfigTest {
    public static void main(String [] args)
    {
        SchwarzWeissDrucker schwarzWeissDrucker = new SchwarzWeissDrucker();
        FarbDrucker farbDrucker = new FarbDrucker();
        NadelDrucker nadelDrucker = new NadelDrucker();
        PDFDrucker pdfDrucker = new PDFDrucker();

        SchwarzWeissDruckbefehl schwarzWeißdruckBefehl =  new SchwarzWeissDruckbefehl(schwarzWeissDrucker);

        Invoker sekretaer = new Sekretaer(schwarzWeißdruckBefehl);

        /*
         * Nutzung
         */
        sekretaer.druckAusloesen("Das Command Pattern ist super!");//Das Command Pattern ist super!

        //Setter um Drucker ändern zu können
        sekretaer.setDruckBefehl(new FarbDruckBefehl(farbDrucker));

        sekretaer.druckAusloesen("Das Command Pattern ist super!");//DAS COMMAND PATTERN IST SUPER!
    }
}
