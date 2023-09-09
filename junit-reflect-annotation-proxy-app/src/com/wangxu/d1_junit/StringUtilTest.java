package com.wangxu.d1_junit;

import org.junit.*;

/**
 * 测试类
 */
public class StringUtilTest {
    @Before
    public void text1(){
        System.out.println("text 1 -- Before");
    }
    @After
    public void text2(){
        System.out.println("text 2 -- After");
    }
    @BeforeClass
    public static void text3(){
        System.out.println("text 3 -- BeforeClass");
    }
    @AfterClass
    public static void text4(){
        System.out.println("text 4 -- AfterClass");
    }

    @Test
    public void testPrintNumber(){
        StringUtil.printNumber("admin");
        StringUtil.printNumber(null);
    }
    @Test
    public void testGetMaxIndex(){
        int index1 = StringUtil.getMaxIndex(null);
        System.out.println(index1);

        int index2 = StringUtil.getMaxIndex("admin");
        System.out.println(index2);

        // 断言机制：程序员可以通过预测业务方法的结果。
        Assert.assertEquals("方法内部存在bug！", 4, index2);
    }
}
