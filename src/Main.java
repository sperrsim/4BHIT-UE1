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

        //Bei einem Count von 20 Laufen die beiden Threads nacheinander ab
        //Bei Höheren Counts fangen sie ab ca 25 an Nebeneinander abzulaufen und die Ausgaben kommen durcheinander
        //meistens wird der DatePrinter früher fertig und die letzten Ausgaben sind nur noch Zahlen des CountPrinters
    }
}
