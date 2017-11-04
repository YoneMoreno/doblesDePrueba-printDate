import java.util.Date;

public class ConsolaMock extends Consola {

    DateOwn fechaImpresa;
    boolean llamado = false;

    @Override
    public void imprimirFecha(DateOwn fecha) {
        llamado = true;
        fechaImpresa = fecha;
        super.imprimirFecha(fecha);
    }
}
