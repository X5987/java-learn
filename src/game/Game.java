package game;

public class Game {

    public static void main(String[] args) {

        Printer printer = new Printer(50, false);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(5 );
        System.out.printf( "Pages printed was %d new total print count for printer %d %n", pagesPrinted, printer.getPagesPrinted());
        pagesPrinted = printer.printPages(10);
        System.out.printf( "Pages printed was %d new total print count for printer %d %n", pagesPrinted, printer.getPagesPrinted());


    }
}
