package demo.gradle;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestClass1 {

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite1() {
        System.out.println("Current Object: " + this.hashCode());
        System.out.println("BEFORE SUITE CALLED");
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite1() {
        System.out.println("Current Object: " + this.hashCode());
        System.out.println("AFTER SUITE CALLED");
    }

    @BeforeMethod(alwaysRun = true)
    public void m1BeforeMethod() {
        System.out.println("Current Object: " + this.hashCode());
        System.out.println("BEFORE METHOD CALLED");
    }

    @AfterMethod(alwaysRun = true)
    public void m1AfterMethod() {
        System.out.println("Current Object: " + this.hashCode());
        System.out.println("AFTER METHOD CALLED");
    }
}
