package testng.groups;

import org.testng.annotations.Test;

public class TestNGGroupsTest1 {
    @Test(groups = {"smoke", "reg"})
    public void test1() {
        System.out.println("GT1-T1");
    }
    @Test(groups = {"reg"})
    public void test2() {
        System.out.println("GT1-T2");
    }
    @Test(groups = {"smoke"})
    public void test3() {
        System.out.println("GT1-T3");
    }
    @Test
    public void test4() {
        System.out.println("GT1-T4");
    }
    @Test(groups = {"reg"})
    public void test5() {
        System.out.println("GT1-T5");
    }
}
