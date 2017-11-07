package collections.list;

/**
 * @author root
 * @time 2017/11/3.
 */
public class LinkedList<T extends Comparable> implements List<T>{
    private Node list;
    private Node head;

    public LinkedList () {
        this.list = null;
        this.head = list;
    }

    private class Node{
        T val;
        Node left;
        Node right;

        public Node (T val) {
            this.val = val;
        }
    }
    @Override public boolean add (T t) {
        Node node = new Node (t);
        if(list == null){
            list = node;
            head = list;
            return true;
        }
        list.right = node;
        node.left = list;
        list = list.right;
        return true;
    }

    @Override public boolean remove (T t) {
        if(head.val.equals (t)){
            head = head.right;
            if(head != null) head.left = null;
            return true;
        }
        if(t.equals (list.val)){
            list = list.left;
            list.right = null;
            return true;
        }
        for (Node i = head; i != null ; i = i.right) {
            if(i.val.equals (t)){
                if(i.left != null) i.left.right = i.right;
                if(i.right != null) i.right.left = i.left;
                i.left = null;
                i.right = null;
                return true;
            }
        }
        throw new NullPointerException ();
    }


    @Override public boolean remove () {
        return false;
    }


    @Override public int size () {
        int c = 0;
        for (Node i = head; i != null ; i = i.right) {
            c++;
        }
        return c;
    }

    @Override public T get (int index) {
        if(list == null) return null;
        int c = 0;
        for (Node i = head; i != null; i = i.right) {
            if(c == index)
                return i.val;
            c++;
        }
        return null;
    }

    @Override public String toString () {
        StringBuilder stringBuilder = new StringBuilder ();
        stringBuilder.append ("[");
        for (Node i = head; i != null ; i = i.right) {
            stringBuilder.append (i.val + ",");
        }
        stringBuilder.deleteCharAt (stringBuilder.length () - 1);
        stringBuilder.append ("]");
        return stringBuilder.toString ();
    }
}
