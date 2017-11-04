import java.util.Date;

public class consola{

    boolean llamado = false;

    public  void imprimirFecha(Date fecha){
        System.out.println(fecha);
        llamado = true;
    }
}
