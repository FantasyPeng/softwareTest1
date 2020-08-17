package pengjf.softwaretest.strman;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static strman.Strman.append;

/**
 * Created by Pengjf on 2020/8/17
 */
public class testAppend extends TestCase {
    /*
     * 测试strman库中的Append 函数
     */
    @Test
    public void testAppend () {
        String expected = "pengjianfei";
        String result = append("p",  "e", "n", "g", "j", "i", "a", "n", "f", "e", "i");
        System.out.println("@Test Append():" + expected);
        assertEquals(expected, result);
    }
}
