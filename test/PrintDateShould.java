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
        String fechaTest = "2014-09-15 15:03:23";
        ConsolaMock consolaMock = new ConsolaMock();
        PrintDate printDate = new PrintDate(consolaMock,new DateOwn());

        printDate.currentDay();

        assertThat(consolaMock.llamado, is (true));
        assertThat(fechaTest, is(new DateOwnStub(fechaTest).toString()));

    }


}
