package testng.groups;

import org.testng.annotations.Test;

public class TestNGGroupsTest2 {
    @Test(groups = "smoke")
    public void test1() {
        System.out.println("GT2-T1");
    }
    @Test(groups = "reg")
    public void test2() {
        System.out.println("GT2-T2");
    }
    @Test(groups = {"smoke","reg"})
    public void test3() {
        System.out.println("GT2-T3");
    }
}
