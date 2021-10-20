package testng.groups;

import org.testng.annotations.Test;

public class TestNGGroupsTest4 {
    @Test(groups = {"reg"})
    public void test1() {
        System.out.println("GT4-T1");
    }
    @Test(groups = {"smoke"})
    public void test2() {
        System.out.println("GT4-T2");
    }
    @Test(groups = {"smoke","reg"})
    public void test3() {
        System.out.println("GT4-T3");
    }
    @Test(groups = {"reg"})
    public void test4() {
        System.out.println("GT4-T4");
    }
    @Test
    public void test5() {
        System.out.println("GT4-T5");
    }

}
