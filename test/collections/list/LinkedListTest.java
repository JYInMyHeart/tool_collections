package collections.list;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author root
 * @time 2017/11/7.
 */

public class LinkedListTest{
    @Test
    public void test1(){
        List<Integer> list = new LinkedList<> ();
        list.add (1);
        list.add (2);
        list.add (3);
        list.add (4);
        list.add (5);
        System.out.println (list);
        Assert.assertEquals (5,list.size ());
        Assert.assertEquals (5,(int)list.get (4));
        Assert.assertEquals (1,(int)list.get (0));
        Assert.assertEquals (3,(int)list.get (2));

        list.remove (2);
        Assert.assertEquals (4,list.size ());
        list.remove (5);
        Assert.assertEquals (3,list.size ());
        list.remove (4);
        Assert.assertEquals (2,list.size ());
        System.out.println (list);
    }
}
