import java.util.Date;

public class DateOwnStub {

    String stringFecha;

    public DateOwnStub(String fecha){
        stringFecha = fecha;
    }

    @Override
    public String toString() {
        return stringFecha;
    }
}
