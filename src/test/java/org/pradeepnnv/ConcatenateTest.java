package org.pradeepnnv;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ConcatenateTest {

    @Test(groups = {"positive"})
    public void positiveTestCase() {
        String concatenated = MyStringProcessor.concatenate("a", "b", "c");
        Assert.assertEquals("a,b,c", concatenated);
    }


    @Test(groups = {"negative"})
    public void negativeTestCase() {
        String concatenated = MyStringProcessor.concatenate("a", "b", "c");
        Assert.assertNotEquals(concatenated,"a,c,b");
    }

    @Test(groups = {"negative"})
    public void anotherNegativeTestCase() {
        String concatenated = MyStringProcessor.concatenate("");
        Assert.assertNotEquals(concatenated,"a,c,b");
    }


    /*
    @BeforeClass
    public void setUp() {
        System.out.println("This is setup before class!!!");
    }

    @BeforeTest
    public void setUpTest(){
        System.out.println("This is a setup before test!!!");
    }

     */
}