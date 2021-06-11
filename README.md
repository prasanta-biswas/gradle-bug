# Gradle TestNG Bug Sample Project

Run the below command to run the test using gradle

`./gradlew clean runTests`

You will probably see the following output

```
Starting a Gradle Daemon, 2 incompatible Daemons could not be reused, use --status for details
  
  > Task :runTests
  
  Gradle suite STANDARD_OUT
      Current Object: 1790582300
      BEFORE SUITE CALLED
  
  Gradle suite > Gradle test > demo.gradle.TestClass2 STANDARD_OUT
      Current Object: 1850452533
      BEFORE METHOD CALLED
  
  Gradle suite > Gradle test > demo.gradle.TestClass2 > test STANDARD_OUT
      Current Object: 1850452533
      TEST METHOD CALLED
  
  Gradle suite > Gradle test > demo.gradle.TestClass2 STANDARD_OUT
      Current Object: 1850452533
      AFTER METHOD CALLED
  
  Gradle suite STANDARD_OUT
      Current Object: 1790582300
      AFTER SUITE CALLED
  
  BUILD SUCCESSFUL in 5s
  3 actionable tasks: 3 executed
```
Notice that the object IDs are different for Before/After Suite method call than that of the rest method calls.
Now let's see the output if we run the same test class using TestNG runner directly - 

Just run the main method of Main.java in IntellijIDEA or Eclipse. The output of that will be similar like below - 

```$xslt
Current Object: 1476011703
BEFORE SUITE CALLED
Current Object: 1476011703
BEFORE METHOD CALLED
Current Object: 1476011703
TEST METHOD CALLED
Current Object: 1476011703
AFTER METHOD CALLED
Current Object: 1476011703
AFTER SUITE CALLED

===============================================
Command line suite
Total tests run: 1, Failures: 0, Skips: 0
===============================================


Process finished with exit code 0
```

Now notice that the object IDs are same for all method calls. This is the way TestNG works as per its documentation.