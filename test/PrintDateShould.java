import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.is;

public class PrintDateShould {

    @Test
    public void testGreen(){
        assertThat (true, is(true));
    }
    @Test
    public void PrintDate_print_date() {
        consola consola = new consola();
        PrintDate printDate = new PrintDate(consola);
        printDate.currentDay();
        assertThat(consola.llamado, is (true));
    }

}
