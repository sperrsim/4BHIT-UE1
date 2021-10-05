/**
 * @author Simon Sperr
 * @version 2021.1.1, 05.10.2021
 */

public class Main {
    public static void main(String[] args) {
        //Creating Objects for the Threads to run
        CountPrinter countPrinter = new CountPrinter();
        DatePrinter datePrinter = new DatePrinter();

        //Creating the Threads
        Thread countThread = new Thread(countPrinter);
        Thread dateThread = new Thread(datePrinter);

        //Starting the Threads
        countThread.start();
        dateThread.start();
    }
}
