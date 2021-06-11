package demo.gradle;

import org.testng.TestNG;

public class Main {
    public static void main(String[] args) {
        TestNG runner = new TestNG();
        runner.setTestClasses(new Class[]{TestClass2.class, TestClass1.class});
        runner.run();
    }
}
