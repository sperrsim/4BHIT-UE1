import java.util.Date;

/**
 * @author Simon Sperr
 * @version 2021.1.1, 05.10.2021
 */

public class DatePrinter implements Runnable{

    Date date = new Date();


    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.printf("Datum&Uhrzeit:%s%n", date);
        }
    }
}
