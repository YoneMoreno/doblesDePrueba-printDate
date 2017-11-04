import org.junit.Test;

import java.text.ParseException;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.is;

public class PrintDateShould {

    boolean llamado = false;

    @Test
    public void testGreen(){
        assertThat (true, is(true));
    }
    @Test
    public void PrintDate_print_date() throws ParseException {
        ConsolaMock consola = new ConsolaMock();
        PrintDate printDate = new PrintDate(consola,new DateOwn());
        printDate.currentDay();
        assertThat(consola.llamado, is (true));
        String fechaTest = "2014-09-15 15:03:23";
        assertThat(fechaTest, is(new DateOwnStub(fechaTest).toString()));

    }


}
