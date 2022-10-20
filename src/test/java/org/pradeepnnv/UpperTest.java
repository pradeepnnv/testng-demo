package org.pradeepnnv;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UpperTest {
    @Test(groups = {"positive"})
    public void testToUpper() {
        String upperCaseString = MyStringProcessor.returnUpper("lower");
        Assert.assertEquals(upperCaseString,"LOWER");
    }

    @Test(groups = {"negative"})
    public void negativeTestToUpper() {
        String upperCaseString = MyStringProcessor.returnUpper("");
        Assert.assertNotEquals(upperCaseString,"A");
    }
}
