package patrones.iterator;

import java.util.List;

public class MyListIterator<E> implements MyIterator<E> {

    private Node<E> head;

    public MyListIterator(List<E> sequence) {
        for(E toAdd : sequence) {
            add(toAdd);
        }
    }

    private void add(E addy) {
        Node toAdd = new Node(addy);
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = toAdd;
    }

    @Override
    public boolean hasNext() {
        return head.next != null;
    }

    @Override
    public E next() {
        E toRet = head.item;
        head = head.next;
        return toRet;
    }

}
