import java.util.Calendar;
import java.util.Objects;

/**
 * Created by DELL on 25/01/2023.
 */
public class SingleLinkedList<E> {

    private Node<E> head=null;
    private Node<E> tail=null;
    private int size=0;
    E element;
    Node<E> next;


    public static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element, Node<E> head) {
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }



    public  boolean equales(Objects obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this.element) {
            return true;
        }
        if (obj.getClass() != obj.getClass()) {
            return false;
        }


        return false;
    }

    public Node FindNode(int index){
        Node myNode;
        myNode= (Node) head;
          while (index-- >0){
              myNode=myNode.next;
              return myNode;
          }
        return myNode;
    }

    public int size(){return size;}
    public boolean isEmpty(){
        return size==0;

    }

    public E first(){
       if(isEmpty()) {
           return null;

       }
       return head.getElement();
    }

    public E last(){
        if(isEmpty()) {
            return null;

        }
        return tail.getElement();
    }

    public int Mysize() {
        Node<E> tmp = head;
        int size = 0;
        if (head == null) {
            return size;
        } else
            size++;
        while (tmp.next != null) {
            tmp = tmp.next;
            size++;

        }
        return size;
    }
    public void rotate()
    {
        Node temp=null;
        Node Current=head;

        while (Current.getNext()!=null)
        {
            temp=Current;
            Current=Current.getNext();
            Current.setNext(head);
            head=Current;
            temp.setNext(null);
        }


    }

    public void revers(){
        Node reverse=null;
        Node Current=head;

        while (Current != null)
        {
            Node next=Current.next;
            reverse=Current;
            Current=next;
        }
        head=reverse;
    }

    public void addfirst(E element)
    {
        head=new Node<E>(element,head);
        if (isEmpty())
        {tail=head;
            size++;

    }}

    @Override
    public String toString() {
        return "SingleLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                ", element=" + element +
                ", next=" + next +
                '}';
    }
}

