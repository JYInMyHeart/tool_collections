package collections.list;

/**
 * @author root
 * @time 2017/11/3.
 */
public interface List<T extends Comparable>{
    boolean add(T t);
    boolean remove(T  t);
    boolean remove ();
    int size();
    T get(int index);

}
