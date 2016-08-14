package com.splurth;

import static org.junit.Assert.*;

import org.junit.Test;

public class Rule3Test {

	@Test
	public void test() {
		PeriodicTable pt=new PeriodicTable();
		boolean passedRule1= pt.checkRule3("Zeddemorium", "Zr");
		assertEquals(true, passedRule1);
	}

}
