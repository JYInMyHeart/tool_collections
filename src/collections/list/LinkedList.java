package collections.list;

/**
 * @author root
 * @time 2017/11/3.
 */
public class LinkedList<T extends Comparable> implements List<T>{
    @Override public boolean add (T t) {
        return false;
    }

    @Override public boolean remove (T t) {
        return false;
    }

    @Override public boolean remove (int index) {
        return false;
    }

    @Override public boolean remove () {
        return false;
    }

    @Override public Object[] resize (int newSize) {
        return new Object[0];
    }

    @Override public int size () {
        return 0;
    }

    @Override public T get (int index) {
        return null;
    }

    @Override public boolean set (int index, T t) {
        return false;
    }
}
