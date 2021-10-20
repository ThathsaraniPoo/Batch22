package testng.groups;

import org.testng.annotations.Test;

public class TestNGGroupsTest3 {
    @Test
    public void test1() {
        System.out.println("GT3-T1");
    }
    @Test (groups = {"reg"})
    public void test2() {
        System.out.println("GT3-T2");
    }
    @Test(groups = {"reg"})
    public void test3() {
        System.out.println("GT3-T3");
    }
    @Test(groups = {"smoke"})
    public void test4() {
        System.out.println("GT3-T4");
    }
}
