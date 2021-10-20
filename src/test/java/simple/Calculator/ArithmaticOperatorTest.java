package simple.Calculator;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import simple.calculator.ArithmaticOperator;

public class ArithmaticOperatorTest {

    ArithmaticOperator calc;
@BeforeMethod
    public void setUp(){
    calc = new ArithmaticOperator();
    
}
@Test
    public void testSum() {
    Assert.assertEquals(calc.sum(-2147483647,-1 ),-2147483647);
    Assert.assertEquals(calc.sum(2147483646,1 ),2147483647);
    Assert.assertEquals(calc.sum(0,-1 ),-1);
    Assert.assertEquals(calc.sum(0,1 ),1);
    }

    @Test(dataProvider = "getValues")
    public void testSum2(int input1,int input2,int expectedValue) {
    Assert.assertEquals(calc.sum(input1,input2),expectedValue);
    }
@DataProvider
    public Object [][] getValues(){
    return new Object[][]{
            {-2147483647,-1,-2147483648},
            {2147483646,1,2147483647},
            {0,-1,-1},
            {0,1,1}
    };
}
}
