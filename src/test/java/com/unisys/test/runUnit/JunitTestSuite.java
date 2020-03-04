package com.unisys.test.runUnit;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;



//JUnit Suite Test
@RunWith(Suite.class)

@Suite.SuiteClasses({ 
	com.unisys.test.module1.CalculatorTest.class ,com.unisys.test.module2.CalculatorTest.class
})

public class JunitTestSuite {
}