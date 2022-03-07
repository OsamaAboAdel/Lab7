package Seventh_Lab;

import java.util.Scanner;

public class TestQueue {
    public static void main ( String[] args ) {

        ArrayQueue<String> q = new ArrayQueue<> ();
        System.out.println ("1: insert to Queue\t2: Delete from Queue" );
        int choice = -1;
        Scanner in = new Scanner ( System.in );
        while (choice != 0){
            System.out.println ("Your Choice ");
            choice = in.nextInt ();
            switch (choice){
                case 0:
                    System.exit ( 0 );
                    break;
                case 1:
                    System.out.println ("Input name : ");
                    q.enqueue ( in.next () );
                    break;
                case 2:
                    System.out.println ("Removed is : "+q.dequeue ());
                    break;
            }
            System.out.println ("First is : "+q.first ()+"\t"+"Size is : "+q.size ());
        }


//        LinkedQueue<String> q = new LinkedQueue<> ();
//        System.out.println ("1: insert to Queue\t2: Delete from Queue" );
//        int choice = -1;
//        Scanner in = new Scanner ( System.in );
//        while (choice != 0){
//            System.out.println ("Your Choice ");
//            choice = in.nextInt ();
//            switch (choice){
//                case 0:
//                    System.exit ( 0 );
//                break;
//                case 1:
//                    System.out.println ("Input name : ");
//                    q.enqueue ( in.next () );
//                    break;
//                case 2:
//                    System.out.println ("Removed is : "+q.dequeue ());
//                    break;
//            }
//            System.out.println ("First is : "+q.first ()+"\t"+"Size is : "+q.size ());
//        }
    }
}
