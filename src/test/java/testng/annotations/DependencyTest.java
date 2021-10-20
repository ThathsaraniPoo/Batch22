package testng.annotations;

import org.testng.annotations.Test;

public class DependencyTest {
    @Test
    public void testLogin() {
        System.out.println("Login");
    }

    @Test(dependsOnMethods = "testLogin")
    public void testCreate() {
        System.out.println("Create");
    }
    @Test (dependsOnMethods = "testCreate")
    public void testEdit() {
        System.out.println("Edit");
    }

    @Test(dependsOnMethods = {"testCreate" ,"testLogin"})
    public void testDelete() {
        System.out.println("Delete");
    }
    @Test (dependsOnMethods = "testLogin")
    public void testLogout() {
        System.out.println("Log out");
    }
}
