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
            //head.left = null;
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
        return null;
    }


    public static void main (String[] args) {
        List<Integer> list1 = new LinkedList<> ();

        list1.add (1);




        list1.remove (1);



    }
}
