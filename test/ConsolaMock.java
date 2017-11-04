public class ConsolaMock extends Consola {

    boolean llamado = false;

    @Override
    public void imprimirFecha(DateOwn fecha) {
        llamado = true;
        super.imprimirFecha(fecha);
    }
}
