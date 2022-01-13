package org.pradeepnnv;

import org.pradeepnnv.MyConcatenator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyConcatenatorTest {

    @Test(groups = {"positive"})
    public void positiveTestCase() throws Exception {
        System.out.println("This is a fast test!!!");
        String concatenated = MyConcatenator.concatanate("a", "b", "c");
        Assert.assertEquals("a,b,c", concatenated);
    }


    @Test(groups = {"negative"})
    public void negativeTestCase() throws Exception {
        System.out.println("This is a fast test!!!");
        String concatenated = MyConcatenator.concatanate("a", "b", "c");
        Assert.assertNotEquals(concatenated,"a,c,b");
    }

    @Test(groups = {"negative"})
    public void anotherNegativeTestCase() throws Exception {
        System.out.println("This is a fast test!!!");
        String concatenated = MyConcatenator.concatanate("");
        Assert.assertNotEquals(concatenated,"a,c,b");
    }

    @Test(groups = {"positive"})
    public void testToUpper() throws Exception {
        String upperCaseString = MyConcatenator.returnUpper("lower");
        Assert.assertEquals(upperCaseString,"LOWER");
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