package Seventh_Lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintFileInConsole {
    public static void main ( String[] args ) throws FileNotFoundException {
        Scanner in = new Scanner (System.in);
        LinkedQueue <String> q = new LinkedQueue<> ();
        System.out.println ("Input file path to Print " );
        for (int i = 0; i < 3; i++) {
            q.enqueue ( in.next () );
        }
        while (!q.isEmpty ( )){
            Scanner fileScanner = new Scanner (new File ( q.dequeue () ));
            while (fileScanner.hasNextLine ()){
                System.out.println (fileScanner.nextLine ());
            }
        }
    }

}
