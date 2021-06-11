package demo.gradle;

import org.testng.annotations.Test;

public class TestClass2 extends TestClass1{

    @Test
    public void test() {
        System.out.println("Current Object: " + this.hashCode());
        System.out.println("TEST METHOD CALLED");
    }
}
