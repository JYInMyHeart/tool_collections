package collections.list;

import org.junit.Assert;

/**
 * @author root
 * @time 2017/11/3.
 */
public class ArrayList<T extends Comparable> implements List<T>{
    private Object[] list;
    private int size;
    private int pos;
    private final static int thresold = 2;
    @SuppressWarnings ("unchecked")
    public ArrayList (int size) {
        this.size = size;
        this.pos = 0;
        list = new Object[size];
    }

    public ArrayList () {
        this(10);
    }

    @Override public boolean add (T t) {
        if(pos + 1 >= list.length / thresold)
            list = resize (thresold * list.length);
        list[pos++] = t;
        return false;
    }

    @Override public boolean remove (T t) {
        for (int i = 0; i < pos; i++) {
            if(list[i].equals (t)){
                for (int j = i + 1; j < pos; j++) {
                    list[j - 1] = list[j];
                }
                pos--;
                return true;
            }
        }
        return false;
    }
    public boolean remove (int index) {
        if(pos <= ((list.length + 1) >> 1))
            resize (list.length >> 1);
        if(index > pos || index < 0)
            throw new NullPointerException ();
        for (int j = index + 1; j < pos; j++) {
            list[j - 1] = list[j];
        }
        pos--;
        return true;
    }

    @Override public boolean remove () {
        return remove (pos);
    }

    public Object[] resize (int newSize) {
        Object[] newList = new Object[newSize];
        for (int i = 0; i < pos; i++) {
            newList[i] = list[i];
        }
        return newList;
    }

    @Override public int size () {
        return pos;
    }

    @Override public T get (int index) {
        if(pos == 0) throw new NullPointerException();
        if(pos - 1 <= list.length / thresold)
            list = resize (list.length / thresold);
        return (T)list[index];
    }

    public boolean set (int index, T t) {
        Assert.assertNotNull (list);
        for (int i = 0; i < pos; i++) {
            if(i == index){
                list[i] = t;
                return true;
            }
        }
        return false;
    }

    @Override public String toString () {
        StringBuilder stringBuilder = new StringBuilder ();
        stringBuilder.append ("[");
        for (int i = 0; i < pos ; i++) {
            stringBuilder.append (list[i] + ",");
        }
        stringBuilder.deleteCharAt (stringBuilder.length () - 1);
        stringBuilder.append ("]");
        return stringBuilder.toString ();
    }

}
