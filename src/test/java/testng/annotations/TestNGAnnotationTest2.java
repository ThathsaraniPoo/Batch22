package testng.annotations;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationTest2 {
    @Test
    public void test1() {
        System.out.println("Test1");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After Method");
    }
}
