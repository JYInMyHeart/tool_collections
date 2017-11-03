package collections.List;

import java.util.Comparator;

/**
 * @author root
 * @time 2017/11/3.
 */
public interface List<T extends Comparable>{
    boolean add(T t);
    boolean remove(T  t);
    boolean remove(int index);
    boolean remove ();
    Object[] resize(int newSize);
    int size();
    T get(int index);
    boolean set(int index,T t);

}
