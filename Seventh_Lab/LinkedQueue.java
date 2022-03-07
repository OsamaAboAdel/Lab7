package Seventh_Lab;

public class LinkedQueue<E> implements Queue<E> {
    SingleLinkedList<E> list = new SingleLinkedList<> ();
    @Override
    public boolean isEmpty () {
        return list.IsEmpty ();
    }

    @Override
    public int size () {
        return list.size ();
    }

    @Override
    public void enqueue ( E element ) {
    list.addLast ( element );
    }

    @Override
    public E dequeue () {
        return list.removeFirst ();
    }

    @Override
    public E first () {
        return list.first ();
    }
}
