package pengjf.softwaretest.strman;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static strman.Strman.append;
import static strman.Strman.collapseWhitespace;

/**
 * Created by Pengjf on 2020/8/17
 */
public class testCollapseWhitespace extends TestCase {
    /*
     * collapseWhitespace 替换掉连续的多个空格为一个空格
     */
    @Test
    public void testCollapseWhitespace () {
        String expected = "peng jian fei";
        String result = collapseWhitespace("peng    jian fei");
        System.out.println("@Test CollapseWhitespace():" + expected);
        assertEquals(expected, result);
    }
}
