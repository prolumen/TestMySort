package ua.ithillel.dnipro;

import junit.framework.TestCase;
import org.junit.Assert;

public class ArraySortTest
    extends TestCase {

    ArraySort arr;
    boolean check;

    @org.junit.Test
    public void testFill() throws Exception{
        arr = new ArraySort();
        check = false;
        int count = 0;
        for (int i =0; i<arr.fill().length; i++){
            int tmp = arr.fill()[i];
            if (tmp==0) {
                count++;
            }
        }
        if (count!=arr.fill().length){
            check = true;
        }
        Assert.assertTrue(check);
    }
    public void testSort() throws Exception{
        check = false;
        arr = new ArraySort();
        arr.fill();
        for (int i=0; i<arr.sort().length-1; i++){
            if (arr.sort()[i]<arr.sort()[i+1]){
                check=true;
            }
            Assert.assertTrue(check);
        }
    }
}
