package collections.list;


import org.junit.Assert;
import org.junit.Test;

/**
 * @author root
 * @time 2017/11/3.
 */
public class ArrayListTest {
    @Test
    public void test1(){
        List<Integer> list = new ArrayList<> ();
        list.add (1);
        list.add (2);
        list.add (3);
        list.add (4);
        list.add (5);

        Assert.assertEquals (5,list.size ());
        list.remove ();
        Assert.assertEquals (4,list.size ());
        list.remove (0);
        Assert.assertEquals (1,(long)list.get (0));
        list.add (6);
        list.add (6);
        list.add (6);
        list.add (6);
        list.add (6);
        list.add (6);
        list.add (6);
        list.add (6);
        System.out.println (list);
        Assert.assertEquals (12,list.size ());
    }
}
