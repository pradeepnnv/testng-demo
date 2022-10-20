package org.pradeepnnv;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UUIDGeneratorTest {
    @Test(groups = {"positive"})
    public void positiveTestCase() {
        String uuid = UUIDGenerator.uuid();
        Assert.assertEquals( uuid.length(),20);
    }

}
