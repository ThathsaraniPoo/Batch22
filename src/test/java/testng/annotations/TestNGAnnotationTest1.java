package testng.annotations;

import org.testng.annotations.Test;

public class TestNGAnnotationTest1 {
    public static void main(String[] args) {
        System.out.println("Hello TestNG !!");
    }

    @Test
    public void print(){
        System.out.println("Hello Test 2!!");
    }
}
