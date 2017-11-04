import java.text.ParseException;
import java.util.Date;

public class PrintDate {

    Consola consola;

    public PrintDate(Consola consola, DateOwn date){
        this.consola = consola;
    }

    public void currentDay () throws ParseException {
        consola.imprimirFecha( new DateOwn());
    }
}
