package pengjf.softwaretest.strman;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static strman.Strman.reverse;

/**
 * Created by Pengjf on 2020/8/17
 */

public class testReverse extends TestCase {
    /*
     * reverse 得到反转后的字符串
     */
    @Test
    public void testReverse () {
        String expected = "peng jian fei";
        String result = reverse("ief naij gnep");
        System.out.println("@Test Reverse():" + expected);
        assertEquals(expected, result);
    }
}
