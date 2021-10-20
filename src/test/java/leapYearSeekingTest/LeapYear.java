package leapYearSeekingTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import valiedLeapYear.LeapYearSeeking;

public class LeapYear {
    LeapYearSeeking sr;

    @BeforeMethod
    public void setUp() {
        sr = new LeapYearSeeking();
    }
    @Test(dataProvider = "getValues")
    public void testSum2(int input1,int expectedValue) {
        Assert.assertEquals(sr.leapYearCal(input1), expectedValue);
    }

    @DataProvider
    public Object [][] getValues() {
        return new Object[][]{
                {2020},
                {1900},
                {2000},
                {2021}
        };
    }
}
