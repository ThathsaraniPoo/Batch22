package testng.assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertTest1 {
    @Test
    public void testAsserEquals() {
        int actualValue =100;
        int expectedValue= 10;
        Assert.assertEquals(actualValue,expectedValue,"faild to match Integers");
    }

    @Test
    public void testsTRINGAsserNotEquals() {
        String actualValue ="Hii";
        String expectedValue ="hii";
        Assert.assertNotEquals(actualValue,expectedValue);
    }
    @Test
    public void testAsserTrue() {
        boolean actualValue =false;
        Assert.assertTrue(actualValue);
    }
    @Test
    public void testAsserFalse() {
        boolean actualValue =false;
        Assert.assertFalse(actualValue);
    }
    @Test
    public void testSoftAssert() {
        boolean actualValue =true;
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertFalse(actualValue);
        System.out.println("SoftAssert Execution");
        softAssert.assertAll();
    }

}
