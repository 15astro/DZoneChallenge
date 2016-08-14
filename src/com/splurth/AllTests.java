package com.splurth;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Rule1Test.class, Rule2Test.class, Rule3Test.class, Rule4Test.class, validNameTest.class })
public class AllTests {

}
