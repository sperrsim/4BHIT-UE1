/**
 * @author Simon Sperr
 * @version 2021.1.1, 05.10.2021
 */

public class CountPrinter implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
    }
}
