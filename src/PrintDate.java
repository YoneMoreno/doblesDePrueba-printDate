import java.util.Date;

public class PrintDate {

    consola consola;

    public PrintDate(consola consola){
        this.consola = consola;
    }

    public void currentDay () {
        //System.out.println( new Date());
        consola.imprimirFecha(new Date());
    }
}
