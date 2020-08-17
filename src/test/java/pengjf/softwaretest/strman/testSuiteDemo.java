package pengjf.softwaretest.strman;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * Created by Pengjf on 2020/8/17
 */
public class testSuiteDemo {
    public static Test suite() {
        //创建TestSuite对象
        TestSuite testSuite = new TestSuite("All Test From TestCaseExample");
        //为TestSuite添加一个测试用例集合，参数为：ClasstestClass
        //通过参数可以知道，其实该参数就是TestCase的子类
        testSuite.addTestSuite(testAppend.class);
        testSuite.addTestSuite(testCollapseWhitespace.class);
        testSuite.addTestSuite(testReverse.class);
        return testSuite;
    }
    public static void main(String[] args) {
        TestRunner.run(suite());
    }
}
