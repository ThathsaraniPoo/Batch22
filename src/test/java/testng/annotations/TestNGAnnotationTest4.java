package testng.annotations;

import org.testng.annotations.*;

public class TestNGAnnotationTest4 {
    @Test
    public void test1() {
        System.out.println("Test1");
    }
    @Test
    public void test2() {
        System.out.println("Test2");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class method");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("After Class method");
    }
}
